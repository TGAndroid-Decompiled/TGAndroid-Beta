package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45704a;
    public final c f45705b;
    public final int f45706c;

    public a(int i10, c cVar, int i11) {
        this.f45704a = i10;
        this.f45705b = cVar;
        this.f45706c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45704a);
        this.f45705b.f45714a.performAction(this.f45706c, bundle);
    }
}
