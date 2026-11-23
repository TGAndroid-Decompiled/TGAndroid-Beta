package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f56740a;
    public final c f56741b;
    public final int f56742c;

    public a(int i7, c cVar, int i10) {
        this.f56740a = i7;
        this.f56741b = cVar;
        this.f56742c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f56740a);
        this.f56741b.f56750a.performAction(this.f56742c, bundle);
    }
}
