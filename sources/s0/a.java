package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f56730a;
    public final c f56731b;
    public final int f56732c;

    public a(int i7, c cVar, int i10) {
        this.f56730a = i7;
        this.f56731b = cVar;
        this.f56732c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f56730a);
        this.f56731b.f56740a.performAction(this.f56732c, bundle);
    }
}
