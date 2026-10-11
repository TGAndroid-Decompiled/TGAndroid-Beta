package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47700a;
    public final d f47701b;
    public final int f47702c;

    public a(int i10, d dVar, int i11) {
        this.f47700a = i10;
        this.f47701b = dVar;
        this.f47702c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47700a);
        this.f47701b.f47711a.performAction(this.f47702c, bundle);
    }
}
