package t1;

import ab.b0;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;
public final class b extends InputConnectionWrapper {
    public final EditText f55263a;
    public final pb.b f55264b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i7;
        pb.b bVar = new pb.b(24);
        this.f55263a = editText;
        this.f55264b = bVar;
        if (l.f2309j != null) {
            l a10 = l.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a10.f2313e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            s1.b bVar2 = (s1.b) ((b0) fVar.f2301c).f907b;
            int a11 = bVar2.a(4);
            if (a11 != 0) {
                i7 = ((ByteBuffer) bVar2.d).getInt(a11 + bVar2.f54144a);
            } else {
                i7 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i7);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.f55263a.getEditableText();
        this.f55264b.getClass();
        if (!pb.b.c1(this, editableText, i7, i10, false) && !super.deleteSurroundingText(i7, i10)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.f55263a.getEditableText();
        this.f55264b.getClass();
        if (pb.b.c1(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10)) {
            return true;
        }
        return false;
    }
}
