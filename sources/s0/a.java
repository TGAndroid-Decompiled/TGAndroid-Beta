package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46467a;
    public final d f46468b;
    public final int f46469c;

    public a(int i10, d dVar, int i11) {
        this.f46467a = i10;
        this.f46468b = dVar;
        this.f46469c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46467a);
        this.f46468b.f46478a.performAction(this.f46469c, bundle);
    }
}
