package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42566a;
    public final d f42567b;
    public final int f42568c;

    public a(int i10, d dVar, int i11) {
        this.f42566a = i10;
        this.f42567b = dVar;
        this.f42568c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42566a);
        this.f42567b.f42576a.performAction(this.f42568c, bundle);
    }
}
