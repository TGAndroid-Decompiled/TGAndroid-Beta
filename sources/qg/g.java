package qg;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x20;
import org.telegram.ui.eg0;
import w7.a6;
public final class g extends FrameLayout {
    public final w9 f40735a;
    public final x20 f40736b;
    public final int f40737c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        x20 x20Var = new x20();
        this.f40736b = x20Var;
        int i10 = jVar.f40755f;
        f6 f6Var = jVar.f40679a;
        if (i10 == 0) {
            this.f40737c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f40735a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, a6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            g9 g9Var = new g9((f6) null);
            g9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, g9Var);
            TextView textView = new TextView(context);
            e2.k(20.0f, 1, textView);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, a6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            x20Var.f28922m = true;
            x20Var.f28913a = true;
            x20Var.d(j6.w0(null, j6.Mj, false), j6.w0(null, j6.Lj, false), 0, 0);
            x20Var.f28915c.setStyle(Paint.Style.STROKE);
            x20Var.f28915c.setStrokeCap(Paint.Cap.ROUND);
            x20Var.f28915c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            di.f fVar = new di.f(context, 4);
            addView(fVar, a6.e(-1, 190, 55));
            eg0 eg0Var = new eg0(context, 1, 1, 1);
            eg0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = j6.Mj;
            canvas.drawColor(i0.a.d(0.5f, j6.v0(i11, f6Var), j6.v0(j6.f17998h5, f6Var)));
            eg0Var.setBackgroundBitmap(createBitmap);
            rg.a aVar = eg0Var.f41485b;
            aVar.f41471w = i11;
            aVar.f41472x = j6.Lj;
            aVar.b();
            addView(eg0Var, a6.e(160, 160, 1));
            eg0Var.j(100L);
            TextView g10 = org.telegram.messenger.a2.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(j6.v0(j6.G6, f6Var));
            em.k(R.string.TelegramBusiness, g10, 17);
            addView(g10, a6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(j6.f18325z6, f6Var));
            em.k(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, a6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f40755f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f40735a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            x20 x20Var = this.f40736b;
            x20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, x20Var.f28915c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f40737c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
