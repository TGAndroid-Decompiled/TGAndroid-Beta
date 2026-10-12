package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f44786a;
    public final c f44787b;
    public final int f44788c;

    public a(int i10, c cVar, int i11) {
        this.f44786a = i10;
        this.f44787b = cVar;
        this.f44788c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f44786a);
        this.f44787b.f44795a.performAction(this.f44788c, bundle);
    }
}
