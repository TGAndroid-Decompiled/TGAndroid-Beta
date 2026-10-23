package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46290a;
    public final d f46291b;
    public final int f46292c;

    public a(int i10, d dVar, int i11) {
        this.f46290a = i10;
        this.f46291b = dVar;
        this.f46292c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46290a);
        this.f46291b.f46300a.performAction(this.f46292c, bundle);
    }
}
