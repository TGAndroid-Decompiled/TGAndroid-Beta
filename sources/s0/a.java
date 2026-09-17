package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45676a;
    public final c f45677b;
    public final int f45678c;

    public a(int i10, c cVar, int i11) {
        this.f45676a = i10;
        this.f45677b = cVar;
        this.f45678c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45676a);
        this.f45677b.f45686a.performAction(this.f45678c, bundle);
    }
}
