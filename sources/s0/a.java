package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46474a;
    public final d f46475b;
    public final int f46476c;

    public a(int i10, d dVar, int i11) {
        this.f46474a = i10;
        this.f46475b = dVar;
        this.f46476c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46474a);
        this.f46475b.f46485a.performAction(this.f46476c, bundle);
    }
}
