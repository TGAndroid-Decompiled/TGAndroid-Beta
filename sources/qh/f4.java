package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import java.util.ArrayList;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
public final class f4 extends y implements org.telegram.ui.ActionBar.w5, m9, i0 {
    public static final int I = 0;
    public final Drawable A;
    public final View B;
    public d4 C;
    public int D;
    public String E;
    public Drawable F;
    public int G;
    public final h0 H;
    public final int f46385n;
    public final b6 f46386r;
    public final Paint f46387s;
    public final Paint v;
    public final Paint f46388w;
    public final TextPaint f46389x;
    public final ImageReceiver f46390y;

    public f4(Context context, int i9, b6 b6Var) {
        super(context);
        this.f46387s = new Paint(1);
        this.v = new Paint(1);
        this.f46388w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f46389x = textPaint;
        this.f46385n = i9;
        this.f46386r = b6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f46390y = new ImageReceiver(this);
        this.A = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.B = view;
        view.setOnClickListener(new x8(this, 22));
        addView(view, e6.e(-1, -2, 51));
        h0 h0Var = new h0(context, b6Var, new m5.c0(this, 22));
        this.H = h0Var;
        addView(h0Var.f46409a, e6.e(-2, -2, 51));
        d();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f46834a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return this.H.f(i9, i10);
    }

    @Override
    public final void b() {
        this.H.i();
    }

    @Override
    public final void d() {
        int i9 = f6.f23218pe;
        b6 b6Var = this.f46386r;
        this.f46387s.setColor(f6.v0(i9, b6Var));
        this.v.setColor(f6.v0(f6.Gd, b6Var));
        this.f46388w.setColor(f6.v0(f6.f23312uf, b6Var));
        int i10 = f6.G6;
        this.f46389x.setColor(f6.l1(0.5f, f6.v0(i10, b6Var)));
        this.A.setColorFilter(new PorterDuffColorFilter(f6.l1(0.5f, f6.v0(i10, b6Var)), PorterDuff.Mode.SRC_IN));
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
        return this.H.f46409a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f46834a;
    }

    public final void h(a aVar, d4 d4Var) {
        this.f46834a = aVar;
        this.C = d4Var;
        c(aVar);
        this.E = null;
        this.H.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.f46390y;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i9 = this.G;
            if (measuredWidth > 0 && i9 > 0) {
                float f10 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f10);
                int i11 = (int) (i9 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
                if (!str.equals(this.E)) {
                    this.E = str;
                    int i12 = MessagesController.getInstance(this.f46385n).mapProvider;
                    this.D = i12;
                    if (i12 == 2) {
                        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.f46385n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.setImageBitmap((Drawable) null);
        this.E = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46390y.onAttachedToWindow();
        this.E = null;
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46390y.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        n9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.f46390y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.f46387s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.A;
            if (drawable != null) {
                int x10 = ll.x(2, centerX, drawable);
                int e10 = ll.e(2, centerY, drawable);
                drawable.setBounds(x10, e10, drawable.getIntrinsicWidth() + x10, drawable.getIntrinsicHeight() + e10);
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
        d4 d4Var = this.C;
        if (d4Var != null && (textSelectionHelper = ((k3) d4Var).f46489a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f24774u0 && R <= textSelectionHelper.f24777x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.G, this.f46388w);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i9;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        this.f46390y.setImageCoords(paddingLeft, getPaddingTop(), max, this.G);
        int paddingTop = getPaddingTop() + this.G;
        this.B.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.H.g(paddingLeft, paddingRight, i13, getPaddingTop() + this.G);
        i();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f22603w > 0 && map.h > 0) {
            this.G = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.f22603w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        } else {
            this.G = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.H.h(paddingLeft, paddingRight, size);
        this.B.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.G + h);
    }
}
