package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45868a;
    public final c f45869b;
    public final int f45870c;

    public a(int i10, c cVar, int i11) {
        this.f45868a = i10;
        this.f45869b = cVar;
        this.f45870c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45868a);
        this.f45869b.f45877a.performAction(this.f45870c, bundle);
    }
}
