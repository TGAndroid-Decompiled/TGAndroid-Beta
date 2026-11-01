package th;

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
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.w20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ky;
public abstract class s6 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.t5 D;
    public final Path E;
    public Bitmap F;
    public boolean G;
    public q6 f49452a;
    public q6 f49453b;
    public vh.p2 f49454c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f49455f;
    public final View h;
    public final org.telegram.ui.ActionBar.p6 f49456n;
    public ArrayList f49457r;
    public final Rect f49458s;
    public final RectF f49459w;
    public final Paint f49460x;
    public final org.telegram.ui.Components.t5 f49461y;

    public s6(Context context, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f49452a = null;
        this.f49453b = null;
        this.f49454c = null;
        this.e = new Matrix();
        this.f49455f = new float[2];
        this.f49458s = new Rect();
        this.f49459w = new RectF();
        Paint paint = new Paint(1);
        this.f49460x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f49456n = p6Var;
        this.f49461y = new org.telegram.ui.Components.t5(view, 0L, 120L, new LinearInterpolator());
        this.D = new org.telegram.ui.Components.t5(view, 0L, 360L, gr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(vh.n5 n5Var) {
        if (n5Var != null && n5Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < n5Var.T0.size(); i10++) {
                if (((w20) n5Var.T0.get(i10)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((w20) n5Var.T0.get(i10)).M);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ky kyVar) {
        FrameLayout frameLayout;
        v6 v6Var;
        ArrayList arrayList2 = this.f49457r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f49457r.size())) {
            vh.p2 p2Var = this.f49454c;
            if (p2Var != null) {
                p2Var.e(true);
                this.f49454c = null;
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
            this.f49453b = null;
            this.D.e(true, 0.0f);
            invalidate();
            b(false);
            this.f49457r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        v6 v6Var2 = new v6(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, kyVar);
                        if (storyItem != null) {
                            v6Var2.c(storyItem.views, false);
                        }
                        w7.e6.a(v6Var2);
                        v6Var = v6Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f51455c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        jg.y0 y0Var = new jg.y0(getContext(), org.telegram.messenger.i0.f16171p);
                        y0Var.setMaxWidth(org.telegram.messenger.i0.f16172q.x);
                        y0Var.setIsVideo(true);
                        y0Var.d(e20.f15506s0, tLObject.f51455c);
                        y0Var.setText(tLObject.a());
                        y0Var.e(3, tL_mediaAreaWeather.color);
                        v6Var = new r6(getContext(), y0Var, mediaArea);
                    } else {
                        v6Var = new q6(getContext(), this.h, mediaArea);
                    }
                    v6Var.setOnClickListener(this);
                    addView(v6Var);
                    double d = mediaArea.coordinates.f20028w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, ky kyVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, kyVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        q6 q6Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            q6 q6Var2 = this.f49453b;
            if (q6Var2 != null && q6Var2.f49411s && !q6Var2.f49413x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f49461y.d(z10);
            q6 q6Var3 = this.f49453b;
            if (q6Var3 != null && q6Var3.f49413x) {
                z11 = true;
            } else {
                z11 = false;
            }
            float d10 = this.D.d(z11);
            int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f49459w;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.t5 t5Var = ((q6) childAt).f49405a;
                        q6 q6Var4 = this.f49453b;
                        if (childAt == q6Var4 && q6Var4.f49411s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float d11 = t5Var.d(z12);
                        if (d11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (d11 * 255.0f);
                            Paint paint = this.f49460x;
                            paint.setAlpha(i12);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
            }
            if ((z11 || d10 > 0.0f) && this.f49452a != null) {
                if (this.F == null) {
                    this.F = ((e2) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f49452a.getX(), this.f49452a.getY(), this.f49452a.getX() + this.f49452a.getMeasuredWidth(), this.f49452a.getY() + this.f49452a.getMeasuredHeight());
                    q6 q6Var5 = this.f49452a;
                    if (q6Var5.f49414y) {
                        f7 = q6Var5.f49410r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.i0.T1(1.0f, f7 * 1.05f, d10);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f49452a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f49452a.f49406b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * q6Var.getMeasuredWidth());
                    } else {
                        measuredHeight = q6Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f49458s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f49452a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f49452a.getX(), this.f49452a.getY());
                    canvas2.rotate(this.f49452a.getRotation(), this.f49452a.getPivotX(), this.f49452a.getPivotY());
                    canvas2.scale(this.f49452a.getScaleX() * T1, this.f49452a.getScaleY() * T1, this.f49452a.getPivotX(), this.f49452a.getPivotY());
                    this.f49452a.b(canvas2);
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
        } else if (view instanceof q6) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((q6) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof q6) {
                    q6 q6Var = (q6) childAt;
                    sg.v vVar = q6Var.H;
                    if (q6Var.f49412w) {
                        org.telegram.messenger.i0.r(vVar);
                        org.telegram.messenger.i0.h3(vVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: th.s6.onClick(android.view.View):void");
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
            } else if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                TL_stories.MediaArea mediaArea = q6Var.f49406b;
                int measuredWidth = q6Var.getMeasuredWidth();
                int measuredHeight = q6Var.getMeasuredHeight();
                q6Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                q6Var.setTranslationX((float) ((mediaArea.coordinates.f20029x / 100.0d) * getMeasuredWidth()));
                q6Var.setTranslationY((float) ((mediaArea.coordinates.f20030y / 100.0d) * getMeasuredHeight()));
                q6Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof r6) {
                r6 r6Var = (r6) childAt;
                TL_stories.MediaArea mediaArea2 = r6Var.f49427a;
                int measuredWidth2 = r6Var.getMeasuredWidth();
                int measuredHeight2 = r6Var.getMeasuredHeight();
                r6Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                r6Var.setTranslationX((float) ((mediaArea2.coordinates.f20029x / 100.0d) * getMeasuredWidth()));
                r6Var.setTranslationY((float) ((mediaArea2.coordinates.f20030y / 100.0d) * getMeasuredHeight()));
                r6Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof q6) {
                q6 q6Var = (q6) getChildAt(i12);
                q6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((q6Var.f49406b.coordinates.f20028w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((q6Var.f49406b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof r6) {
                r6 r6Var = (r6) getChildAt(i12);
                r6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r6Var.f49427a.coordinates.f20028w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r6Var.f49427a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vh.p2 p2Var;
        if (getChildCount() == 0 || (p2Var = this.f49454c) == null || !p2Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            vh.p2 p2Var2 = this.f49454c;
            if (p2Var2 != null) {
                p2Var2.e(true);
                this.f49454c = null;
            }
            this.f49453b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
