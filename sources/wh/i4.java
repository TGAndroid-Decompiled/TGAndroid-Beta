package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
public final class i4 extends z implements b6, l9, j0 {
    public static final int J = 0;
    public final Drawable B;
    public final View C;
    public g4 D;
    public int E;
    public String F;
    public Drawable G;
    public int H;
    public final i0 I;
    public final int f49790n;
    public final g6 f49791r;
    public final Paint f49792s;
    public final Paint v;
    public final Paint f49793w;
    public final TextPaint f49794x;
    public final ImageReceiver f49795y;

    public i4(Context context, int i10, g6 g6Var) {
        super(context);
        this.f49792s = new Paint(1);
        this.v = new Paint(1);
        this.f49793w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f49794x = textPaint;
        this.f49790n = i10;
        this.f49791r = g6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f49795y = new ImageReceiver(this);
        this.B = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.C = view;
        view.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        addView(view, c6.e(-1, -2, 51));
        i0 i0Var = new i0(context, g6Var, new org.telegram.ui.web.e0(this, 21));
        this.I = i0Var;
        addView(i0Var.f49777a, c6.e(-2, -2, 51));
        e();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f50174a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49616b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.I.f(i10, i11);
    }

    @Override
    public final void b() {
        this.I.i();
    }

    @Override
    public final int d() {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.c(canvas);
    }

    @Override
    public final void e() {
        int i10 = k6.f21883pe;
        g6 g6Var = this.f49791r;
        this.f49792s.setColor(k6.v0(i10, g6Var));
        this.v.setColor(k6.v0(k6.Gd, g6Var));
        this.f49793w.setColor(k6.v0(k6.f21970uf, g6Var));
        int i11 = k6.G6;
        this.f49794x.setColor(k6.l1(0.5f, k6.v0(i11, g6Var)));
        this.B.setColorFilter(new PorterDuffColorFilter(k6.l1(0.5f, k6.v0(i11, g6Var)), PorterDuff.Mode.SRC_IN));
        i0 i0Var = this.I;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.I.e(arrayList);
    }

    @Override
    public e1 getCaptionEditText() {
        return this.I.f49777a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f50174a;
    }

    public final void h(a aVar, g4 g4Var) {
        this.f50174a = aVar;
        this.D = g4Var;
        c(aVar);
        this.F = null;
        this.I.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.f49795y;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i10 = this.H;
            if (measuredWidth > 0 && i10 > 0) {
                float f10 = AndroidUtilities.density;
                int i11 = (int) (measuredWidth / f10);
                int i12 = (int) (i10 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
                if (!str.equals(this.F)) {
                    this.F = str;
                    int i13 = MessagesController.getInstance(this.f49790n).mapProvider;
                    this.E = i13;
                    if (i13 == 2) {
                        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.f49790n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.setImageBitmap((Drawable) null);
        this.F = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49795y.onAttachedToWindow();
        this.F = null;
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49795y.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        m9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.f49795y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.f49792s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.B;
            if (drawable != null) {
                int u10 = org.telegram.ui.b.u(2, centerX, drawable);
                int f10 = org.telegram.ui.b.f(2, centerY, drawable);
                drawable.setBounds(u10, f10, drawable.getIntrinsicWidth() + u10, drawable.getIntrinsicHeight() + f10);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.E == 2 && imageReceiver.hasNotThumb()) {
                    if (this.G == null) {
                        this.G = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.G.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.G.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight);
                    this.G.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.G.setBounds(centerX2, centerY2, intrinsicWidth + centerX2, intrinsicHeight + centerY2);
                    this.G.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        g4 g4Var = this.D;
        if (g4Var != null && (textSelectionHelper = ((n3) g4Var).f49889a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f23175u0 && R <= textSelectionHelper.f23178x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.H, this.f49793w);
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.f49795y.setImageCoords(paddingLeft, getPaddingTop(), max, this.H);
        int paddingTop = getPaddingTop() + this.H;
        this.C.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.I.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.H);
        i();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f21066w > 0 && map.h > 0) {
            this.H = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.f21066w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        } else {
            this.H = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.I.h(paddingLeft, paddingRight, size);
        this.C.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.H + h);
    }
}
