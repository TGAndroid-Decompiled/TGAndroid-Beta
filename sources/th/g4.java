package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i7.f6;
import java.util.ArrayList;
import nh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
public final class g4 extends y implements org.telegram.ui.ActionBar.x5, j9, i0 {
    public static final int I = 0;
    public final Drawable A;
    public final View B;
    public e4 C;
    public int D;
    public String E;
    public Drawable F;
    public int G;
    public final h0 H;
    public final int f48457n;
    public final c6 f48458r;
    public final Paint f48459s;
    public final Paint v;
    public final Paint f48460w;
    public final TextPaint f48461x;
    public final ImageReceiver f48462y;

    public g4(Context context, int i10, c6 c6Var) {
        super(context);
        this.f48459s = new Paint(1);
        this.v = new Paint(1);
        this.f48460w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f48461x = textPaint;
        this.f48457n = i10;
        this.f48458r = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f48462y = new ImageReceiver(this);
        this.A = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.B = view;
        view.setOnClickListener(new mh.n(this, 28));
        addView(view, f6.e(-1, -2, 51));
        h0 h0Var = new h0(context, c6Var, new d6(this, 27));
        this.H = h0Var;
        addView(h0Var.f48471a, f6.e(-2, -2, 51));
        e();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f48892a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
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
    public final int d() {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.c(canvas);
    }

    @Override
    public final void e() {
        int i10 = g6.f23285pe;
        c6 c6Var = this.f48458r;
        this.f48459s.setColor(g6.v0(i10, c6Var));
        this.v.setColor(g6.v0(g6.Gd, c6Var));
        this.f48460w.setColor(g6.v0(g6.f23374uf, c6Var));
        int i11 = g6.G6;
        this.f48461x.setColor(g6.l1(0.5f, g6.v0(i11, c6Var)));
        this.A.setColorFilter(new PorterDuffColorFilter(g6.l1(0.5f, g6.v0(i11, c6Var)), PorterDuff.Mode.SRC_IN));
        h0 h0Var = this.H;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.H.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.H.f48471a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f48892a;
    }

    public final void h(a aVar, e4 e4Var) {
        this.f48892a = aVar;
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
        ImageReceiver imageReceiver = this.f48462y;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i10 = this.G;
            if (measuredWidth > 0 && i10 > 0) {
                float f9 = AndroidUtilities.density;
                int i11 = (int) (measuredWidth / f9);
                int i12 = (int) (i10 / f9);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
                if (!str.equals(this.E)) {
                    this.E = str;
                    int i13 = MessagesController.getInstance(this.f48457n).mapProvider;
                    this.D = i13;
                    if (i13 == 2) {
                        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.f48457n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
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
        this.f48462y.onAttachedToWindow();
        this.E = null;
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48462y.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.f48462y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.f48459s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.A;
            if (drawable != null) {
                int v = org.telegram.ui.b.v(2, centerX, drawable);
                int f9 = org.telegram.ui.b.f(2, centerY, drawable);
                drawable.setBounds(v, f9, drawable.getIntrinsicWidth() + v, drawable.getIntrinsicHeight() + f9);
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
        if (e4Var != null && (textSelectionHelper = ((l3) e4Var).f48559a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f24607u0 && R <= textSelectionHelper.f24610x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.G, this.f48460w);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.f48462y.setImageCoords(paddingLeft, getPaddingTop(), max, this.G);
        int paddingTop = getPaddingTop() + this.G;
        this.B.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.H.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.G);
        i();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f22615w > 0 && map.h > 0) {
            this.G = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.f22615w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        } else {
            this.G = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.H.h(paddingLeft, paddingRight, size);
        this.B.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.G + h);
    }
}
