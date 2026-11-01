package rh;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k80;
public final class n2 extends View {
    public final TextPaint f47235a;
    public final k80 f47236b;
    public final Paint f47237c;
    public final Paint d;
    public StaticLayout e;
    public boolean f47238f;
    public int h;
    public int f47239n;
    public BitmapShader f47240r;
    public Matrix f47241s;
    public Matrix f47242w;
    public CharSequence f47243x;

    public n2(Context context) {
        super(context);
        this.h = org.telegram.messenger.i0.L(6.0f);
        this.f47239n = org.telegram.messenger.i0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f47235a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        Paint paint = new Paint(1);
        this.f47237c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(9.66f)));
        this.f47236b = new k80(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.f47243x = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.f47235a, i10 - org.telegram.messenger.i0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        k80 k80Var = this.f47236b;
        k80Var.rewind();
        int i11 = this.h;
        int i12 = this.f47239n;
        k80Var.e = i11;
        k80Var.f27551f = i12;
        if (this.f47238f) {
            k80Var.e(null, 0, 0.0f, 0.0f);
            float f7 = Float.MAX_VALUE;
            float width = this.e.getWidth();
            float f10 = Float.MIN_VALUE;
            float f11 = 0.0f;
            for (int i13 = 0; i13 < this.e.getLineCount(); i13++) {
                width = Math.min(width, this.e.getLineLeft(i13));
                f10 = Math.min(f10, this.e.getLineTop(i13));
                f11 = Math.max(f11, this.e.getLineRight(i13));
                f7 = Math.max(f7, this.e.getLineBottom(i13));
            }
            this.f47236b.addRect(width, f10, f11, this.e.getHeight(), Path.Direction.CW);
        } else {
            k80Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), k80Var);
            k80Var.a();
        }
        invalidate();
    }

    public final void b(int i10, TL_stars.SavedStarGift savedStarGift) {
        int i11;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long e = e20.i(i10).e();
            long o10 = org.telegram.messenger.o5.o(savedStarGift.from_id);
            long o11 = org.telegram.messenger.o5.o(savedStarGift.gift.owner_id);
            if (e == o10) {
                if (savedStarGift.gift.crafted) {
                    i11 = 2131749620;
                } else {
                    i11 = 2131749621;
                }
                set(org.telegram.messenger.i0.W2(dd.a0(null, null, i11, dd.r(savedStarGift.date, false))));
                return;
            } else if (e == o11) {
                set(org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749602, org.telegram.messenger.o5.s(i10, o10), dd.r(savedStarGift.date, false))));
                return;
            } else {
                set(org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749601, org.telegram.messenger.o5.s(i10, o10), org.telegram.messenger.o5.s(i10, o11), dd.r(savedStarGift.date, false))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, org.telegram.messenger.i0.L(16.0f));
            Matrix matrix = this.f47241s;
            if (matrix != null) {
                matrix.reset();
                this.f47242w.reset();
                n2 n2Var = this;
                while (n2Var != 0) {
                    this.f47242w.postConcat(n2Var.getMatrix());
                    if (n2Var.getParent() instanceof View) {
                        n2Var = (View) n2Var.getParent();
                    } else {
                        n2Var = 0;
                    }
                }
                this.f47242w.invert(this.f47241s);
                this.f47241s.preTranslate((-this.h) / 2, -org.telegram.messenger.i0.L(16.0f));
                this.f47241s.preScale(12.0f, 12.0f);
                this.f47240r.setLocalMatrix(this.f47241s);
            }
            Paint paint = this.f47237c;
            k80 k80Var = this.f47236b;
            canvas.drawPath(k80Var, paint);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(k80Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.f47243x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + org.telegram.messenger.i0.L(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(kj kjVar) {
        TLRPC.Message message;
        if (kjVar != null && (message = kjVar.f16690k) != null && message.action != null) {
            int i10 = kjVar.I1;
            long e = e20.i(i10).e();
            TLRPC.MessageAction messageAction = kjVar.f16690k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                setVisibility(8);
                return;
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
                if (peer == null) {
                    setVisibility(8);
                    return;
                }
                long o10 = org.telegram.messenger.o5.o(peer);
                long o11 = org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.peer);
                if (e == o10) {
                    set(org.telegram.messenger.i0.W2(dd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749620 : 2131749621, dd.r(kjVar.f16690k.date, false))));
                } else if (e == o11) {
                    set(org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749602, org.telegram.messenger.o5.s(i10, o10), dd.r(kjVar.f16690k.date, false))));
                } else {
                    set(org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749601, org.telegram.messenger.o5.s(i10, o10), org.telegram.messenger.o5.s(i10, o11), dd.r(kjVar.f16690k.date, false))));
                }
                setVisibility(0);
                return;
            } else {
                setVisibility(8);
                return;
            }
        }
        setVisibility(8);
    }

    public void setFullRect(boolean z10) {
        this.f47238f = z10;
    }

    public void setRoundRadius(float f7) {
        this.f47237c.setPathEffect(new CornerPathEffect(f7));
        this.d.setPathEffect(new CornerPathEffect(f7));
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
