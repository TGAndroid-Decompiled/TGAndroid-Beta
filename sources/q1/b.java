package q1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import com.google.firebase.messaging.s;
import java.nio.ByteBuffer;
public final class b extends InputConnectionWrapper {
    public final EditText f40457a;
    public final na.d f40458b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i10;
        na.d dVar = new na.d(19);
        this.f40457a = editText;
        this.f40458b = dVar;
        if (l.f1029j != null) {
            l a2 = l.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a2.e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            p1.b bVar = (p1.b) ((s) fVar.f1021c).f6118b;
            int a10 = bVar.a(4);
            if (a10 != 0) {
                i10 = ((ByteBuffer) bVar.d).getInt(a10 + bVar.f39520a);
            } else {
                i10 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f40457a.getEditableText();
        this.f40458b.getClass();
        if (!na.d.r3(this, editableText, i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f40457a.getEditableText();
        this.f40458b.getClass();
        if (na.d.r3(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}
