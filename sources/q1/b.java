package q1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.k;
import com.google.firebase.messaging.t;
import d7.u;
import java.nio.ByteBuffer;
public final class b extends InputConnectionWrapper {
    public final EditText f45898a;
    public final u f45899b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i9;
        u uVar = new u(21);
        this.f45898a = editText;
        this.f45899b = uVar;
        if (k.f856j != null) {
            k a2 = k.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a9.c cVar = a2.f860e;
            cVar.getClass();
            Bundle bundle = editorInfo.extras;
            p1.b bVar = (p1.b) ((t) cVar.f119c).f4177b;
            int a3 = bVar.a(4);
            if (a3 != 0) {
                i9 = ((ByteBuffer) bVar.d).getInt(a3 + bVar.f45335a);
            } else {
                i9 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i9);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i9, int i10) {
        Editable editableText = this.f45898a.getEditableText();
        this.f45899b.getClass();
        if (!u.i2(this, editableText, i9, i10, false) && !super.deleteSurroundingText(i9, i10)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        Editable editableText = this.f45898a.getEditableText();
        this.f45899b.getClass();
        if (u.i2(this, editableText, i9, i10, true) || super.deleteSurroundingTextInCodePoints(i9, i10)) {
            return true;
        }
        return false;
    }
}
