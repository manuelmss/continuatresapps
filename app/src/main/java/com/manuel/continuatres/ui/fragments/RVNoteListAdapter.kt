package com.manuel.continuatres.ui.fragments


import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.manuel.continuatres.databinding.ItemNoteBinding
import com.manuel.model.Note

class RVNoteListAdapter(var notes: List<Note>): RecyclerView.Adapter<NoteVH>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteVH {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteVH(binding)
    }

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: NoteVH, position: Int) {
        holder.bind(notes[position])
    }

}

class NoteVH(private val binding: ItemNoteBinding): ViewHolder(binding.root) {

    fun bind(note: Note) {
        binding.txtNoteTitle.text = note.strAlbum
        binding.txtCreateNote.text = note.intYearReleased
    }
}