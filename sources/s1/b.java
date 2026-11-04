package s1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;
import v7.s;
public final class b extends InputConnectionWrapper {
    public final EditText f54575a;
    public final s f54576b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i3;
        s sVar = new s(22);
        this.f54575a = editText;
        this.f54576b = sVar;
        if (l.f1732j != null) {
            l a10 = l.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a10.f1736e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            r1.b bVar = (r1.b) ((ui.f) fVar.f1724c).f56390b;
            int a11 = bVar.a(4);
            if (a11 != 0) {
                i3 = ((ByteBuffer) bVar.d).getInt(a11 + bVar.f54061a);
            } else {
                i3 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i3);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i3, int i10) {
        Editable editableText = this.f54575a.getEditableText();
        this.f54576b.getClass();
        if (!s.F0(this, editableText, i3, i10, false) && !super.deleteSurroundingText(i3, i10)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i10) {
        Editable editableText = this.f54575a.getEditableText();
        this.f54576b.getClass();
        if (s.F0(this, editableText, i3, i10, true) || super.deleteSurroundingTextInCodePoints(i3, i10)) {
            return true;
        }
        return false;
    }
}
