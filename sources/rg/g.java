package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bg0;
import w7.y5;
public final class g extends FrameLayout {
    public final w9 f42621a;
    public final r20 f42622b;
    public final int f42623c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        r20 r20Var = new r20();
        this.f42622b = r20Var;
        int i10 = jVar.f42638f;
        e6 e6Var = jVar.f42581a;
        if (i10 == 0) {
            this.f42623c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f42621a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, y5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((e6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(i6.v0(i6.G6, e6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, y5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            r20Var.f27891m = true;
            r20Var.f27882a = true;
            r20Var.d(i6.w0(null, i6.Mj, false), i6.w0(null, i6.Lj, false), 0, 0);
            r20Var.f27884c.setStyle(Paint.Style.STROKE);
            r20Var.f27884c.setStrokeCap(Paint.Cap.ROUND);
            r20Var.f27884c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, y5.e(-1, 190, 55));
            bg0 bg0Var = new bg0(context, 1, 1, 1);
            bg0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = i6.Mj;
            canvas.drawColor(i0.a.d(0.5f, i6.v0(i11, e6Var), i6.v0(i6.f19128h5, e6Var)));
            bg0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = bg0Var.f43270b;
            aVar.f43258w = i11;
            aVar.f43259x = i6.Lj;
            aVar.b();
            addView(bg0Var, y5.e(160, 160, 1));
            bg0Var.j(100L);
            TextView f7 = org.telegram.messenger.l0.f(context, 1, 20.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextColor(i6.v0(i6.G6, e6Var));
            qk.l(R.string.TelegramBusiness, f7, 17);
            addView(f7, y5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(i6.v0(i6.f19461z6, e6Var));
            qk.l(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, y5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f42638f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f42621a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            r20 r20Var = this.f42622b;
            r20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, r20Var.f27884c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f42623c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
