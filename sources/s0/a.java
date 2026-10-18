package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45858a;
    public final c f45859b;
    public final int f45860c;

    public a(int i10, c cVar, int i11) {
        this.f45858a = i10;
        this.f45859b = cVar;
        this.f45860c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45858a);
        this.f45859b.f45867a.performAction(this.f45860c, bundle);
    }
}
