package qh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class a6 extends View {
    public z5 B;
    public View C;
    public Object D;
    public Runnable E;
    public String F;
    public final int[] G;
    public final int[] H;
    public boolean I;
    public final int f44971a;
    public final f8 f44972b;
    public g8 f44973c;
    public final org.telegram.ui.Components.z5 d;
    public final RectF f44974e;
    public final RectF f44975f;
    public final ImageReceiver h;
    public boolean f44976n;
    public k01 f44977r;
    public k01 f44978s;
    public final Path v;
    public final Paint f44979w;
    public final rc f44980x;
    public boolean f44981y;

    public a6(Activity activity, int i10, f8 f8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.f44974e = new RectF();
        this.f44975f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f44979w = new Paint(1);
        this.f44980x = new rc(this);
        this.G = new int[2];
        this.H = new int[2];
        this.f44971a = i10;
        this.f44972b = f8Var;
    }

    public final void a() {
        z5 z5Var = this.B;
        if (z5Var == null) {
            return;
        }
        this.f44977r = new k01(z5Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.B.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            oq oqVar = new oq(R.drawable.settings_arrow, 0);
            oqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f44978s = new k01(spannableStringBuilder, 14.0f, null);
        this.B.d(this.h);
        this.f44976n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Object obj;
        int[] iArr;
        int[] iArr2;
        float e6 = this.d.e(this.f44981y);
        k01 k01Var = this.f44977r;
        if (k01Var != null && this.f44978s != null && e6 > 0.0f) {
            k01Var.f28238p = getWidth() * 0.7f;
            this.f44978s.f28238p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f44976n) {
                f10 = dp5 + dp3 + dp5;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f44977r.f28227c, this.f44978s.f28227c) + f10 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f44976n) {
                f11 = dp3;
            } else {
                f11 = 0.0f;
            }
            float max2 = Math.max(f11, this.f44978s.j() + this.f44977r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e6) * this.f44980x.a(0.05f);
            float dp6 = (1.0f - e6) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.f44974e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f44975f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f44979w;
            if (i10 >= 29 && (obj = this.D) != null && this.C != null) {
                RenderNode c3 = org.telegram.messenger.b.c(obj);
                Path path = this.v;
                path.rewind();
                f13 = 2.0f;
                f12 = dp;
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.G);
                this.C.getLocationOnScreen(this.H);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * e6), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.C.getWidth() / c3.getWidth(), this.C.getHeight() / c3.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(c3);
                canvas.restore();
                paint.setColor(org.telegram.ui.ActionBar.k6.l1(e6, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f12 = dp;
                f13 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.k6.l1(e6, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f15 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f44976n) {
                float f16 = dp3 / f13;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f16);
                imageReceiver.setImageCoords(rectF.left + f12 + dp5, rectF.centerY() - f16, dp3, dp3);
                imageReceiver.setAlpha(e6);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f44978s.j() + (this.f44977r.j() + dp4)) / f13);
            k01 k01Var2 = this.f44977r;
            float f17 = rectF.left;
            if (this.f44976n) {
                f14 = dp5 + dp3 + dp5;
            } else {
                f14 = 0.0f;
            }
            k01Var2.c(f17 + f14 + f12, (k01Var2.j() / f13) + centerY, e6, -1, canvas);
            k01 k01Var3 = this.f44978s;
            float f18 = rectF.left;
            if (this.f44976n) {
                f15 = dp3 + dp5 + dp5;
            }
            k01Var3.c(f18 + f15 + f12, this.f44977r.j() + centerY + dp4 + (this.f44978s.j() / f13), e6, org.telegram.ui.ActionBar.k6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g8 g8Var;
        boolean z4 = this.f44981y;
        rc rcVar = this.f44980x;
        if (z4 && this.B != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f44974e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.I = true;
                    rcVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (rcVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    rcVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (rcVar.h && (g8Var = this.f44973c) != null && this.B != null) {
                    g8Var.run(new w5(this, 1));
                }
                rcVar.c(false);
                this.I = false;
            } else if (motionEvent.getAction() == 3) {
                rcVar.c(false);
                this.I = false;
            }
            if (!this.I && !rcVar.h) {
                return false;
            }
            return true;
        }
        this.I = false;
        rcVar.c(false);
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        f8 f8Var = this.f44972b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.E;
            if (runnable2 != null) {
                runnable2.run();
                this.E = null;
            }
            if (this.f44981y) {
                invalidate();
            }
            this.f44981y = false;
            this.F = null;
            if (f8Var != null) {
                f8Var.run();
                return;
            }
            return;
        }
        z5 z5Var = this.B;
        if ((z5Var == null && this.E == null) || (z5Var != null && !TextUtils.equals(z5Var.f46405a, str) && !TextUtils.equals(this.F, str))) {
            Runnable runnable3 = this.E;
            if (runnable3 != null) {
                runnable3.run();
                this.E = null;
            }
            this.B = null;
            this.F = str;
            int i10 = this.f44971a;
            w5 w5Var = new w5(this, 0);
            try {
                MessagesController messagesController = MessagesController.getInstance(i10);
                String str2 = messagesController.linkPrefix;
                Uri parse = Uri.parse(str);
                if (TextUtils.equals(parse.getHost(), str2)) {
                    List<String> pathSegments = parse.getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        String str3 = pathSegments.get(0);
                        String queryParameter = parse.getQueryParameter("ref");
                        if (TextUtils.isEmpty(queryParameter)) {
                            TLObject userOrChat = messagesController.getUserOrChat(str3);
                            if (userOrChat instanceof TLRPC.User) {
                                w5Var.run(new x5(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                w5Var.run(new y5(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new fg.f0(w5Var, messagesController, str, 1));
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                w5Var.run(runnable);
            }
            this.E = runnable;
            return;
        }
        z5 z5Var2 = this.B;
        if (z5Var2 != null && !this.f44981y && TextUtils.equals(z5Var2.f46405a, str)) {
            this.f44981y = true;
            a();
            invalidate();
            if (f8Var != null) {
                f8Var.run();
            }
        }
    }
}
