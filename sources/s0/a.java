package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47676a;
    public final d f47677b;
    public final int f47678c;

    public a(int i10, d dVar, int i11) {
        this.f47676a = i10;
        this.f47677b = dVar;
        this.f47678c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47676a);
        this.f47677b.f47688a.performAction(this.f47678c, bundle);
    }
}
