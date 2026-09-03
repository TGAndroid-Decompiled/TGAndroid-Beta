package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f43959a;
    public final d f43960b;
    public final int f43961c;

    public a(int i10, d dVar, int i11) {
        this.f43959a = i10;
        this.f43960b = dVar;
        this.f43961c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f43959a);
        this.f43960b.f43969a.performAction(this.f43961c, bundle);
    }
}
