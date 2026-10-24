package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46289a;
    public final d f46290b;
    public final int f46291c;

    public a(int i10, d dVar, int i11) {
        this.f46289a = i10;
        this.f46290b = dVar;
        this.f46291c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46289a);
        this.f46290b.f46299a.performAction(this.f46291c, bundle);
    }
}
