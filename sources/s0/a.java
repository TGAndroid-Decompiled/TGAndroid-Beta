package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42898a;
    public final d f42899b;
    public final int f42900c;

    public a(int i10, d dVar, int i11) {
        this.f42898a = i10;
        this.f42899b = dVar;
        this.f42900c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42898a);
        this.f42899b.f42908a.performAction(this.f42900c, bundle);
    }
}
