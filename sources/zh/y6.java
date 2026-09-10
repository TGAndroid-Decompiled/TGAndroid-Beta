package zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bi.r9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iz;
public abstract class y6 extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public w6 f49115a;
    public w6 f49116b;
    public bi.x4 f49117c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f49118f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 f49119n;
    public ArrayList f49120r;
    public final Rect f49121s;
    public final RectF v;
    public final Paint f49122w;
    public final org.telegram.ui.Components.d6 f49123x;
    public final org.telegram.ui.Components.d6 f49124y;

    public y6(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f49115a = null;
        this.f49116b = null;
        this.f49117c = null;
        this.e = new Matrix();
        this.f49118f = new float[2];
        this.f49121s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f49122w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f49119n = f6Var;
        this.f49123x = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        this.f49124y = new org.telegram.ui.Components.d6(view, 0L, 360L, wr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(r9 r9Var) {
        if (r9Var != null && r9Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < r9Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) r9Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) r9Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, iz izVar) {
        FrameLayout frameLayout;
        b7 b7Var;
        ArrayList arrayList2 = this.f49120r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f49120r.size())) {
            bi.x4 x4Var = this.f49117c;
            if (x4Var != null) {
                x4Var.e(true);
                this.f49117c = null;
            }
            int i10 = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i10);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i10--;
                }
                i10++;
            }
            this.f49116b = null;
            this.f49124y.d(0.0f, true);
            invalidate();
            b(false);
            this.f49120r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        b7 b7Var2 = new b7(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, izVar);
                        if (storyItem != null) {
                            b7Var2.c(storyItem.views, false);
                        }
                        w7.c6.a(b7Var2);
                        b7Var = b7Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f2573c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        pg.s0 s0Var = new pg.s0(getContext(), AndroidUtilities.density);
                        s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        s0Var.setIsVideo(true);
                        s0Var.d(UserConfig.selectedAccount, tLObject.f2573c);
                        s0Var.setText(tLObject.a());
                        s0Var.e(3, tL_mediaAreaWeather.color);
                        b7Var = new x6(getContext(), s0Var, mediaArea);
                    } else {
                        b7Var = new w6(getContext(), this.h, mediaArea);
                    }
                    b7Var.setOnClickListener(this);
                    addView(b7Var);
                    double d = mediaArea.coordinates.f17431w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, iz izVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, izVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        float f10;
        float f11;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            w6 w6Var = this.f49116b;
            if (w6Var != null && w6Var.f49018s && !w6Var.f49019w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f49123x.e(z10);
            w6 w6Var2 = this.f49116b;
            if (w6Var2 != null && w6Var2.f49019w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e7 = this.f49124y.e(z11);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.d6 d6Var = ((w6) childAt).f49012a;
                        w6 w6Var3 = this.f49116b;
                        if (childAt == w6Var3 && w6Var3.f49018s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e10 = d6Var.e(z12);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e10 * 255.0f);
                            Paint paint = this.f49122w;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
            }
            if ((z11 || e7 > f7) && this.f49115a != null) {
                if (this.F == null) {
                    this.F = ((f2) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f49115a.getX(), this.f49115a.getY(), this.f49115a.getX() + this.f49115a.getMeasuredWidth(), this.f49115a.getY() + this.f49115a.getMeasuredHeight());
                    w6 w6Var4 = this.f49115a;
                    if (w6Var4.f49020x) {
                        f11 = w6Var4.f49017r.a(0.05f);
                    } else {
                        f11 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f11 * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f49115a.getRotation(), rectF.centerX(), rectF.centerY());
                    w6 w6Var5 = this.f49115a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = w6Var5.f49013b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * w6Var5.getMeasuredWidth());
                    } else {
                        measuredHeight = w6Var5.getMeasuredHeight() * f10;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f7, f7, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f49121s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f49115a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f49115a.getX(), this.f49115a.getY());
                    canvas2.rotate(this.f49115a.getRotation(), this.f49115a.getPivotX(), this.f49115a.getPivotY());
                    canvas2.scale(this.f49115a.getScaleX() * lerp, this.f49115a.getScaleY() * lerp, this.f49115a.getPivotX(), this.f49115a.getPivotY());
                    this.f49115a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof w6) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((w6) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof w6) {
                    w6 w6Var = (w6) childAt;
                    k5 k5Var = w6Var.H;
                    if (w6Var.v) {
                        AndroidUtilities.cancelRunOnUIThread(k5Var);
                        AndroidUtilities.runOnUIThread(k5Var, 400L);
                    }
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    @Override
    public final void onClick(android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: zh.y6.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof w6) {
                w6 w6Var = (w6) childAt;
                TL_stories.MediaArea mediaArea = w6Var.f49013b;
                int measuredWidth = w6Var.getMeasuredWidth();
                int measuredHeight = w6Var.getMeasuredHeight();
                w6Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                w6Var.setTranslationX((float) ((mediaArea.coordinates.f17432x / 100.0d) * getMeasuredWidth()));
                w6Var.setTranslationY((float) ((mediaArea.coordinates.f17433y / 100.0d) * getMeasuredHeight()));
                w6Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof x6) {
                x6 x6Var = (x6) childAt;
                TL_stories.MediaArea mediaArea2 = x6Var.f49070a;
                int measuredWidth2 = x6Var.getMeasuredWidth();
                int measuredHeight2 = x6Var.getMeasuredHeight();
                x6Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                x6Var.setTranslationX((float) ((mediaArea2.coordinates.f17432x / 100.0d) * getMeasuredWidth()));
                x6Var.setTranslationY((float) ((mediaArea2.coordinates.f17433y / 100.0d) * getMeasuredHeight()));
                x6Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof w6) {
                w6 w6Var = (w6) getChildAt(i12);
                w6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((w6Var.f49013b.coordinates.f17431w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((w6Var.f49013b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof x6) {
                x6 x6Var = (x6) getChildAt(i12);
                x6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((x6Var.f49070a.coordinates.f17431w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((x6Var.f49070a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        bi.x4 x4Var;
        if (getChildCount() == 0 || (x4Var = this.f49117c) == null || !x4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            bi.x4 x4Var2 = this.f49117c;
            if (x4Var2 != null) {
                x4Var2.e(true);
                this.f49117c = null;
            }
            this.f49116b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
