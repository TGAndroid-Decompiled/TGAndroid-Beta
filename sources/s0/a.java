package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46870a;
    public final d f46871b;
    public final int f46872c;

    public a(int i10, d dVar, int i11) {
        this.f46870a = i10;
        this.f46871b = dVar;
        this.f46872c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46870a);
        this.f46871b.f46881a.performAction(this.f46872c, bundle);
    }
}
