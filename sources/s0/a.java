package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54590a;
    public final d f54591b;
    public final int f54592c;

    public a(int i7, d dVar, int i10) {
        this.f54590a = i7;
        this.f54591b = dVar;
        this.f54592c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54590a);
        this.f54591b.f54601a.performAction(this.f54592c, bundle);
    }
}
