package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
public final class y2 {
    public final Paint f49073a;
    public final Paint f49074b;
    public final Paint f49075c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f49076f;
    public final com.google.firebase.messaging.n f49077g = new com.google.firebase.messaging.n(5);
    public final RectF h = new RectF();
    public final RectF f49078i = new RectF();
    public final RectF f49079j = new RectF();
    public final RectF f49080k;
    public final Paint f49081l;
    public final Drawable f49082m;
    public final Drawable f49083n;
    public final Drawable f49084o;
    public final Drawable f49085p;
    public final Drawable f49086q;
    public final Drawable f49087r;
    public final Drawable f49088s;
    public final hj0 f49089t;
    public final hj0 f49090u;

    public y2(Context context) {
        new RectF();
        this.f49080k = new RectF();
        this.f49081l = new Paint();
        this.f49082m = context.getDrawable(R.drawable.media_share);
        this.f49084o = context.getDrawable(R.drawable.media_like);
        this.f49083n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.f49085p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.f49086q = context.getDrawable(R.drawable.media_more);
        this.f49087r = context.getDrawable(R.drawable.menu_stream_pip);
        this.f49088s = context.getDrawable(R.drawable.msg_delete);
        this.f49090u = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f49089t = hj0Var;
        hj0Var.N(20, false, true);
        hj0Var.stop();
        Paint paint = new Paint(1);
        this.f49073a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f49074b = paint2;
        paint2.setColor(-1);
        int k10 = i0.a.k(-16777216, 102);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.f49075c = paint3;
        paint3.setColor(k10);
        this.f49076f = new ColorDrawable(i0.a.d(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11 = 20;
        hj0 hj0Var = this.f49090u;
        if (!z11) {
            if (z10) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            hj0Var.N(i10, false, false);
            if (!z10) {
                i11 = 0;
            }
            hj0Var.P(i11);
        } else if (z10) {
            if (hj0Var.f23648b0 > 20) {
                hj0Var.N(0, false, false);
            }
            hj0Var.P(20);
            hj0Var.start();
        } else {
            int i12 = hj0Var.f23648b0;
            if (i12 != 0 && i12 < 43) {
                hj0Var.P(43);
                hj0Var.start();
            }
        }
    }
}
