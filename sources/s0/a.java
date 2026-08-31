package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f46839a;
    public final d f46840b;
    public final int f46841c;

    public a(int i10, d dVar, int i11) {
        this.f46839a = i10;
        this.f46840b = dVar;
        this.f46841c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46839a);
        this.f46840b.f46850a.performAction(this.f46841c, bundle);
    }
}
