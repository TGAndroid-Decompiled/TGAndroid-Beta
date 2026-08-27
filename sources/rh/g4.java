package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;

public final class g4 extends y implements org.telegram.ui.ActionBar.x5, i9, i0 {
    public static final int I = 0;
    public final Drawable A;
    public final View B;
    public e4 C;
    public int D;
    public String E;
    public Drawable F;
    public int G;
    public final h0 H;

    public final int f47157n;

    public final c6 f47158r;

    public final Paint f47159s;
    public final Paint v;

    public final Paint f47160w;

    public final TextPaint f47161x;

    public final ImageReceiver f47162y;

    public g4(Context context, int i10, c6 c6Var) {
        super(context);
        this.f47159s = new Paint(1);
        this.v = new Paint(1);
        this.f47160w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f47161x = textPaint;
        this.f47157n = i10;
        this.f47158r = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f47162y = new ImageReceiver(this);
        this.A = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.B = view;
        view.setOnClickListener(new lh.c5(this, 24));
        addView(view, z5.e(-1, -2, 51));
        h0 h0Var = new h0(context, c6Var, new n1.d(this, 19));
        this.H = h0Var;
        addView(h0Var.f47171a, z5.e(-2, -2, 51));
        d();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f47594a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return (TL_iv.pageBlockMap) pageBlock;
        }
        return null;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.H.f(i10, i11);
    }

    @Override
    public final void b() {
        this.H.i();
    }

    @Override
    public final void d() {
        int i10 = g6.pe;
        c6 c6Var = this.f47158r;
        this.f47159s.setColor(g6.v0(i10, c6Var));
        this.v.setColor(g6.v0(g6.Gd, c6Var));
        this.f47160w.setColor(g6.v0(g6.f23366uf, c6Var));
        int i11 = g6.G6;
        this.f47161x.setColor(g6.l1(0.5f, g6.v0(i11, c6Var)));
        this.A.setColorFilter(new PorterDuffColorFilter(g6.l1(0.5f, g6.v0(i11, c6Var)), PorterDuff.Mode.SRC_IN));
        h0 h0Var = this.H;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.c(canvas);
    }

    @Override
    public final int e() {
        return 0;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.H.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.H.f47171a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f47594a;
    }

    public final void h(a aVar, e4 e4Var) {
        this.f47594a = aVar;
        this.C = e4Var;
        c(aVar);
        this.E = null;
        this.H.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.f47162y;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.setImageBitmap((Drawable) null);
            this.E = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i10 = this.G;
        if (measuredWidth <= 0 || i10 <= 0) {
            return;
        }
        float f10 = AndroidUtilities.density;
        int i11 = (int) (measuredWidth / f10);
        int i12 = (int) (i10 / f10);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
        if (str.equals(this.E)) {
            return;
        }
        this.E = str;
        int i13 = MessagesController.getInstance(this.f47157n).mapProvider;
        this.D = i13;
        if (i13 == 2) {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.f47157n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47162y.onAttachedToWindow();
        this.E = null;
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47162y.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        j9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.f47162y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.f47159s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.A;
            if (drawable != null) {
                int iV = rl.v(2, centerX, drawable);
                int iE = rl.e(2, centerY, drawable);
                drawable.setBounds(iV, iE, drawable.getIntrinsicWidth() + iV, drawable.getIntrinsicHeight() + iE);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.D == 2 && imageReceiver.hasNotThumb()) {
                    if (this.F == null) {
                        this.F = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.F.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.F.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight);
                    this.F.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.F.setBounds(centerX2, centerY2, intrinsicWidth + centerX2, intrinsicHeight + centerY2);
                    this.F.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        e4 e4Var = this.C;
        if (e4Var != null && (textSelectionHelper = ((l3) e4Var).f47259a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int iR = RecyclerView.R(this);
            if (iR >= 0 && iR > textSelectionHelper.f24540u0 && iR <= textSelectionHelper.f24543x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.G, this.f47160w);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int iMax = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.f47162y.setImageCoords(paddingLeft, getPaddingTop(), iMax, this.G);
        this.B.layout(paddingLeft, getPaddingTop(), iMax + paddingLeft, getPaddingTop() + this.G);
        this.H.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.G);
        i();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iMax = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.f22603w <= 0 || map.h <= 0) {
            this.G = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.G = Math.max(Math.min((int) ((((long) (iMax - AndroidUtilities.dp(32.0f))) * ((long) map.h)) / ((long) map.f22603w)), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        }
        int iH = this.H.h(paddingLeft, paddingRight, size);
        this.B.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.G + iH);
    }
}
