package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42615a;
    public final c f42616b;
    public final int f42617c;

    public a(int i10, c cVar, int i11) {
        this.f42615a = i10;
        this.f42616b = cVar;
        this.f42617c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42615a);
        this.f42616b.f42624a.performAction(this.f42617c, bundle);
    }
}
