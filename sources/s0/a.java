package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47852a;
    public final c f47853b;
    public final int f47854c;

    public a(int i10, c cVar, int i11) {
        this.f47852a = i10;
        this.f47853b = cVar;
        this.f47854c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47852a);
        this.f47853b.f47861a.performAction(this.f47854c, bundle);
    }
}
