package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42869a;
    public final c f42870b;
    public final int f42871c;

    public a(int i10, c cVar, int i11) {
        this.f42869a = i10;
        this.f42870b = cVar;
        this.f42871c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42869a);
        this.f42870b.f42878a.performAction(this.f42871c, bundle);
    }
}
