package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42913a;
    public final d f42914b;
    public final int f42915c;

    public a(int i10, d dVar, int i11) {
        this.f42913a = i10;
        this.f42914b = dVar;
        this.f42915c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42913a);
        this.f42914b.f42923a.performAction(this.f42915c, bundle);
    }
}
