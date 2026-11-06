package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54497a;
    public final d f54498b;
    public final int f54499c;

    public a(int i7, d dVar, int i10) {
        this.f54497a = i7;
        this.f54498b = dVar;
        this.f54499c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54497a);
        this.f54498b.f54508a.performAction(this.f54499c, bundle);
    }
}
