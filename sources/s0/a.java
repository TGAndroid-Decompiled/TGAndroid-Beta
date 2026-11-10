package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54601a;
    public final d f54602b;
    public final int f54603c;

    public a(int i7, d dVar, int i10) {
        this.f54601a = i7;
        this.f54602b = dVar;
        this.f54603c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54601a);
        this.f54602b.f54612a.performAction(this.f54603c, bundle);
    }
}
