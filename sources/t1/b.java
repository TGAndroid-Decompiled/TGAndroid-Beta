package t1;

import ab.c0;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;
import w7.s;
public final class b extends InputConnectionWrapper {
    public final EditText f57532a;
    public final s f57533b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i7;
        s sVar = new s(24);
        this.f57532a = editText;
        this.f57533b = sVar;
        if (l.f2222j != null) {
            l a10 = l.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a10.f2226e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            s1.b bVar = (s1.b) ((c0) fVar.f2214c).f908b;
            int a11 = bVar.a(4);
            if (a11 != 0) {
                i7 = ((ByteBuffer) bVar.d).getInt(a11 + bVar.f56302a);
            } else {
                i7 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i7);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.f57532a.getEditableText();
        this.f57533b.getClass();
        if (!s.m0(this, editableText, i7, i10, false) && !super.deleteSurroundingText(i7, i10)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.f57532a.getEditableText();
        this.f57533b.getClass();
        if (s.m0(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10)) {
            return true;
        }
        return false;
    }
}
