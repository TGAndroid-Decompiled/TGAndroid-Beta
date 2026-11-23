package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f56775a;
    public final c f56776b;
    public final int f56777c;

    public a(int i7, c cVar, int i10) {
        this.f56775a = i7;
        this.f56776b = cVar;
        this.f56777c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f56775a);
        this.f56776b.f56785a.performAction(this.f56777c, bundle);
    }
}
