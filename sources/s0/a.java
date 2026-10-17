package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45886a;
    public final c f45887b;
    public final int f45888c;

    public a(int i10, c cVar, int i11) {
        this.f45886a = i10;
        this.f45887b = cVar;
        this.f45888c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45886a);
        this.f45887b.f45895a.performAction(this.f45888c, bundle);
    }
}
