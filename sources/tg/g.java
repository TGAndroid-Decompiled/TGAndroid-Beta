package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.qd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z20;
public final class g extends FrameLayout {
    public final y9 f48860a;
    public final z20 f48861b;
    public final int f48862c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        z20 z20Var = new z20();
        this.f48861b = z20Var;
        int i10 = jVar.f48880f;
        u6 u6Var = jVar.f48815a;
        if (i10 == 0) {
            this.f48862c = AndroidUtilities.dp(150.0f);
            y9 y9Var = new y9(context);
            this.f48860a = y9Var;
            y9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(y9Var, gb1.h(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            j9 j9Var = new j9((u6) null);
            j9Var.r(currentUser);
            y9Var.getImageReceiver().setForUserOrChat(currentUser, j9Var);
            TextView textView = new TextView(context);
            ic.a.o(20.0f, 1, textView);
            f7.V(textView, y6.G6, u6Var);
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, gb1.h(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            z20Var.f35191m = true;
            z20Var.f35182a = true;
            z20Var.d(y6.x0(null, y6.Mj, false), y6.x0(null, y6.Lj, false), 0, 0);
            z20Var.f35184c.setStyle(Paint.Style.STROKE);
            z20Var.f35184c.setStrokeCap(Paint.Cap.ROUND);
            z20Var.f35184c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            hi.e eVar = new hi.e(context, 4);
            addView(eVar, gb1.i(-1, 190, 55));
            qd qdVar = new qd(context, 1, 1, 2);
            qdVar.setStarParticlesView(eVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = y6.Mj;
            canvas.drawColor(i0.a.f(0.5f, y6.w0(i11, u6Var), y6.w0(y6.f23425h5, u6Var)));
            qdVar.setBackgroundBitmap(createBitmap);
            ug.g gVar = qdVar.f49813b;
            gVar.f49797z = i11;
            gVar.A = y6.Lj;
            gVar.b();
            addView(qdVar, gb1.i(160, 160, 1));
            qdVar.m(100L);
            TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
            g7.setTypeface(AndroidUtilities.bold());
            f7.V(g7, y6.G6, u6Var);
            vh.k(R.string.TelegramBusiness, g7, 17);
            addView(g7, gb1.h(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            f7.V(textView2, y6.f23765z6, u6Var);
            vh.k(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, gb1.h(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f48880f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f48860a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            z20 z20Var = this.f48861b;
            z20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, z20Var.f35184c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f48862c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
