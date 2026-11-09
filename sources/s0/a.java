package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54602a;
    public final d f54603b;
    public final int f54604c;

    public a(int i7, d dVar, int i10) {
        this.f54602a = i7;
        this.f54603b = dVar;
        this.f54604c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54602a);
        this.f54603b.f54613a.performAction(this.f54604c, bundle);
    }
}
