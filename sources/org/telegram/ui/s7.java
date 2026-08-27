package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

public abstract class s7 extends FrameLayout implements org.telegram.ui.Components.wb0 {

    public final ArrayList f42530a;

    public final org.telegram.ui.Components.o71 f42531b;

    public final View f42532c;
    public final org.telegram.ui.ActionBar.n2 d;

    public final ArrayList f42533e;

    public ih.b f42534f;
    public final org.telegram.ui.Components.p71 h;

    public final r7[] f42535n;

    public h7 f42536r;

    public int f42537s;
    public i7 v;

    public s7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.f42530a = new ArrayList();
        this.f42533e = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f42535n = r7VarArr;
        this.d = n2Var;
        r7VarArr[0] = new r7(LocaleController.getString(R.string.FilterChats), 0, new j7(this));
        r7VarArr[1] = new r7(LocaleController.getString(R.string.MediaTab), 1, new o7(this));
        r7VarArr[2] = new r7(LocaleController.getString(R.string.SharedFilesTab2), 2, new l7(this));
        r7VarArr[3] = new r7(LocaleController.getString(R.string.Music), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f42535n;
            if (i10 >= r7VarArr2.length) {
                org.telegram.ui.Components.p71 p71Var = new org.telegram.ui.Components.p71(getContext(), null);
                this.h = p71Var;
                p71Var.setAllowDisallowInterceptTouch(false);
                addView(p71Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.o71 o71VarN = p71Var.n(3, true);
                this.f42531b = o71VarN;
                addView(o71VarN, h7.z5.c(48.0f, -1));
                View view = new View(getContext());
                this.f42532c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
                addView(view, h7.z5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                p71Var.setAdapter(new e7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, h7.z5.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                imageView.setImageDrawable(g2Var);
                int i11 = org.telegram.ui.ActionBar.g6.f23425y8;
                g2Var.a(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.g6.f23443z8;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42530a.add(imageView);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) {

                    public final s7 f36445b;

                    {
                        this.f36445b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.f36445b.v.t1();
                                break;
                            default:
                                this.f36445b.v.clear();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
                j6Var.setTextSize(AndroidUtilities.dp(18.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                linearLayout.addView(j6Var, h7.z5.m(1.0f, 0, -1, 18, 0, 0));
                this.f42530a.add(j6Var);
                org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), false, null);
                v0Var.setIcon(R.drawable.msg_clear);
                v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                v0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42530a.add(v0Var);
                final int i14 = 1;
                v0Var.setOnClickListener(new View.OnClickListener(this) {

                    public final s7 f36445b;

                    {
                        this.f36445b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.f36445b.v.t1();
                                break;
                            default:
                                this.f36445b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            r7 r7Var = r7VarArr2[i10];
            if (r7Var != null) {
                this.f42533e.add(i10, r7Var);
            }
            i10++;
        }
    }

    public static void a(s7 s7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.zk0 zk0Var) {
        ArrayList arrayList = o7Var.f37950e;
        PhotoViewer.t1().K2(null, s7Var.d, null);
        if (s7Var.f42536r == null) {
            s7Var.f42536r = new h7(s7Var);
        }
        s7Var.f42536r.f38692a = zk0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.t1().f2(o7Var.f41022r, arrayList.indexOf(m7Var), -1, false, s7Var.f42536r, null);
        }
    }

    public static void b(s7 s7Var, ih.a aVar, k7 k7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = s7Var.d;
        org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) s7Var.h.getCurrentView();
        if (k7Var.f39631e == 2) {
            if (!(zk0Var.getAdapter() instanceof l7)) {
                return;
            }
            PhotoViewer.t1().K2(null, n2Var, null);
            if (s7Var.f42536r == null) {
                s7Var.f42536r = new h7(s7Var);
            }
            s7Var.f42536r.f38692a = zk0Var;
            File file = aVar.f11476a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, s7Var.f42536r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
            }
        }
        if (k7Var.f39631e == 3) {
            if (!MediaController.getInstance().isPlayingMessage(aVar.f11480f)) {
                MediaController.getInstance().playMessage(aVar.f11480f);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(aVar.f11480f);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(aVar.f11480f);
            }
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f42533e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f42534f != null) {
            int i10 = 0;
            while (true) {
                r7[] r7VarArr = this.f42535n;
                if (i10 >= r7VarArr.length) {
                    break;
                }
                r7 r7Var = r7VarArr[i10];
                if (r7Var != null) {
                    if (r7Var.f41825b == 0 && !this.f42534f.f11483b.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].f41825b == 1 && !this.f42534f.d.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].f41825b == 2 && !this.f42534f.f11485e.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].f41825b == 3 && !this.f42534f.f11486f.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].f41825b == 5 && !this.f42534f.f11487g.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].f41825b == 4 && !this.f42534f.h.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.p71 p71Var = this.h;
        if (size == 1 && this.f42534f.f11482a) {
            this.f42531b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) p71Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.f42532c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() != arrayList2.size()) {
            p71Var.C(true);
            break;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((r7) arrayList.get(i11)).f41825b != ((r7) arrayList2.get(i11)).f41825b) {
                p71Var.C(true);
                break;
            }
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            f7 f7Var = ((r7) arrayList2.get(i12)).f41826c;
            ((r7) arrayList2.get(i12)).f41826c.F();
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p71 p71Var = this.h;
            if (i10 >= p71Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.zk0) p71Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.zk0 getListView() {
        org.telegram.ui.Components.p71 p71Var = this.h;
        if (p71Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.zk0) p71Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f42537s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p71 p71Var = this.h;
            if (i11 >= p71Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) p71Var.getViewPages()[i11];
            if (zk0Var != null) {
                zk0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(ih.b bVar) {
        this.f42534f = bVar;
        c();
    }

    public void setDelegate(i7 i7Var) {
        this.v = i7Var;
    }
}
