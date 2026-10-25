package q1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import com.google.firebase.messaging.q;
import java.nio.ByteBuffer;
import u7.s;
public final class b extends InputConnectionWrapper {
    public final EditText f46896a;
    public final s f46897b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i10;
        s sVar = new s(19);
        this.f46896a = editText;
        this.f46897b = sVar;
        if (l.f2555j != null) {
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
            p1.b bVar = (p1.b) ((q) fVar.f2547c).f7757a;
            int a10 = bVar.a(4);
            if (a10 != 0) {
                i10 = ((ByteBuffer) bVar.d).getInt(a10 + bVar.f46480a);
            } else {
                i10 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f46896a.getEditableText();
        this.f46897b.getClass();
        if (!s.N0(this, editableText, i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f46896a.getEditableText();
        this.f46897b.getClass();
        if (s.N0(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}
