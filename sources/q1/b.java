package q1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import com.google.firebase.messaging.t;
import java.nio.ByteBuffer;

public final class b extends InputConnectionWrapper {

    public final EditText f46062a;

    public final ab.a f46063b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        ab.a aVar = new ab.a(21);
        super(inputConnection, false);
        this.f46062a = editText;
        this.f46063b = aVar;
        if (l.f1358j != null) {
            l lVarA = l.a();
            if (lVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = lVarA.f1362e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            p1.b bVar = (p1.b) ((t) fVar.f1349b).f4619b;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.d).getInt(iA + bVar.f45341a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f46062a.getEditableText();
        this.f46063b.getClass();
        return ab.a.B3(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f46062a.getEditableText();
        this.f46063b.getClass();
        return ab.a.B3(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
