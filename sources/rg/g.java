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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.w9;
import org.telegram.ui.fg0;
import w7.y5;
public final class g extends FrameLayout {
    public final w9 f42546a;
    public final o20 f42547b;
    public final int f42548c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        o20 o20Var = new o20();
        this.f42547b = o20Var;
        int i10 = jVar.f42563f;
        e6 e6Var = jVar.f42506a;
        if (i10 == 0) {
            this.f42548c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f42546a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, y5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((e6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(j6.v0(j6.G6, e6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, y5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            o20Var.f26832m = true;
            o20Var.f26823a = true;
            o20Var.d(j6.w0(null, j6.Mj, false), j6.w0(null, j6.Lj, false), 0, 0);
            o20Var.f26825c.setStyle(Paint.Style.STROKE);
            o20Var.f26825c.setStrokeCap(Paint.Cap.ROUND);
            o20Var.f26825c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, y5.e(-1, 190, 55));
            fg0 fg0Var = new fg0(context, 1, 1, 1);
            fg0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = j6.Mj;
            canvas.drawColor(i0.a.d(0.5f, j6.v0(i11, e6Var), j6.v0(j6.f19133h5, e6Var)));
            fg0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = fg0Var.f43195b;
            aVar.f43183w = i11;
            aVar.f43184x = j6.Lj;
            aVar.b();
            addView(fg0Var, y5.e(160, 160, 1));
            fg0Var.j(100L);
            TextView g10 = org.telegram.messenger.q.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(j6.v0(j6.G6, e6Var));
            wh.k(R.string.TelegramBusiness, g10, 17);
            addView(g10, y5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(j6.f19464z6, e6Var));
            wh.k(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, y5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f42563f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f42546a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            o20 o20Var = this.f42547b;
            o20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, o20Var.f26825c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f42548c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
