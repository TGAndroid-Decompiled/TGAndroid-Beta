package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47472a;
    public final c f47473b;
    public final int f47474c;

    public a(int i10, c cVar, int i11) {
        this.f47472a = i10;
        this.f47473b = cVar;
        this.f47474c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47472a);
        this.f47473b.f47482a.performAction(this.f47474c, bundle);
    }
}
