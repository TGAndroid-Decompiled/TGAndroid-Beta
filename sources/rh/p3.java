package rh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import h7.z6;
import j$.util.Map;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ib0;
import org.telegram.ui.ol0;
import org.telegram.ui.op0;

public final class p3 extends k51 {

    public static final ArrayList f47334o4 = new ArrayList();
    public TL_iv.pageTableCell A3;
    public long B3;
    public float C3;
    public float D3;
    public boolean E3;
    public b2 F3;
    public int G3;
    public d1 H3;
    public final h I3;
    public ArrayList J3;
    public int K3;
    public int L3;
    public int M3;
    public boolean N3;
    public a O3;
    public boolean P3;
    public final h3 Q3;
    public final l2 R3;
    public final i3 S3;
    public final j3 T3;
    public final k3 U3;
    public final IdentityHashMap V3;
    public final IdentityHashMap W3;
    public a X3;
    public a Y3;
    public final l3 Z3;

    public final u2 f47335a4;

    public final int f47336b3;

    public final v2 f47337b4;

    public final c6 f47338c3;

    public final w2 f47339c4;

    public final n3 f47340d3;

    public final x2 f47341d4;

    public MessageObject f47342e3;

    public g5 f47343e4;

    public boolean f47344f3;

    public b70 f47345f4;

    public TL_iv.RichMessage f47346g3;

    public int f47347g4;

    public final ArrayList f47348h3;

    public int f47349h4;

    public final HashMap f47350i3;

    public final m2 f47351i4;

    public final d3 f47352j3;

    public final y2 f47353j4;

    public final v9 f47354k3;

    public final n2.b0 f47355k4;

    public int f47356l3;

    public final ArrayList f47357l4;

    public int f47358m3;

    public gl0 f47359m4;

    public int f47360n3;

    public int f47361n4;

    public boolean f47362o3;

    public float f47363p3;

    public float f47364q3;

    public float f47365r3;

    public float f47366s3;

    public View f47367t3;

    public b f47368u3;

    public boolean f47369v3;

    public boolean f47370w3;

    public boolean f47371x3;

    public boolean f47372y3;

    public TL_iv.pageTableCell f47373z3;

    public p3(Context context, int i10, c6 c6Var, n3 n3Var) {
        super(context, i10, 0, false, new a8(p3VarArr, 28), new lh.p(p3VarArr, 23), null, c6Var);
        this.f47344f3 = true;
        this.f47348h3 = new ArrayList();
        this.f47350i3 = new HashMap();
        this.f47356l3 = -1;
        this.f47358m3 = -1;
        this.f47360n3 = 0;
        this.I3 = new h(this, 2);
        this.N3 = true;
        this.Q3 = new h3(this);
        this.R3 = new l2(this);
        this.S3 = new i3(this);
        this.T3 = new j3(this);
        this.U3 = new k3(this);
        this.V3 = new IdentityHashMap();
        this.W3 = new IdentityHashMap();
        this.Z3 = new l3(this);
        this.f47335a4 = new u2(this);
        this.f47337b4 = new v2(this);
        this.f47339c4 = new w2(this);
        this.f47341d4 = new x2(this);
        this.f47347g4 = -1;
        this.f47349h4 = -1;
        this.f47351i4 = new m2(this);
        this.f47353j4 = new y2(this);
        n2.b0 b0Var = new n2.b0(this, 19);
        this.f47355k4 = b0Var;
        this.f47357l4 = new ArrayList();
        this.f47361n4 = -1;
        p3[] p3VarArr = {this};
        this.f47336b3 = i10;
        this.f47338c3 = c6Var;
        this.f47340d3 = n3Var;
        this.U2.f26942r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new a8(this, 29), false);
        setReorderLongPressEnabled(false);
        w1(true);
        d3 d3Var = new d3(this, n3Var);
        this.f47352j3 = d3Var;
        d3Var.T(this);
        d3Var.E0 = this.T2;
        v9 v9VarO = d3Var.o(context);
        this.f47354k3 = v9VarO;
        AndroidUtilities.removeFromParent(v9VarO);
        d3Var.D = new f3(this, n3Var);
        j(new fh.l(9, this, n3Var));
        this.F3 = new b2(b0Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        return (E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || B3(pageBlock);
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean F3(a aVar) {
        return aVar != null && !aVar.f47033i && !x3(aVar) && (aVar.f47028b instanceof TL_iv.pageBlockParagraph) && aVar.f47029c == 0 && aVar.d == 0 && !aVar.f47030e && aVar.f47035k.isEmpty();
    }

    public static void I1(p3[] p3VarArr, ArrayList arrayList, b51 b51Var) {
        int i10;
        boolean z10;
        ArrayList arrayList2;
        p3 p3Var = p3VarArr[0];
        if (p3Var != null) {
            ArrayList arrayList3 = p3Var.f47348h3;
            p3Var.a2();
            ArrayList arrayList4 = p3Var.f47357l4;
            arrayList4.clear();
            HashMap map = new HashMap();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i10 = 1;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(i11);
                boolean z11 = aVar.f47033i;
                ArrayList arrayList5 = aVar.f47035k;
                if (!z11) {
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        Map.EL.merge(map, (Long) arrayList5.get(i13), 1, new q2());
                    }
                    if (aVar.f47028b instanceof TL_iv.pageBlockParagraph) {
                        i12++;
                    }
                }
                i11++;
            }
            boolean z12 = i12 == 1;
            ArrayList arrayList6 = new ArrayList();
            int i14 = -1;
            int i15 = 0;
            boolean z13 = false;
            a aVar2 = null;
            int size = -1;
            while (i15 < arrayList3.size()) {
                a aVar3 = (a) arrayList3.get(i15);
                boolean z14 = aVar3.f47033i;
                ArrayList arrayList7 = aVar3.f47035k;
                if (z14) {
                    boolean z15 = size != i14;
                    if (!arrayList6.isEmpty()) {
                        a9.p.s(i10, arrayList6);
                    }
                    if (size == i14 || arrayList6.size() >= size) {
                        if (!z15) {
                            if (z13) {
                                b51Var.L();
                                z13 = false;
                            }
                            int i16 = r0.f47403a;
                            n41 n41VarJ = n41.J(r0.class);
                            n41VarJ.G = aVar3;
                            arrayList.add(n41VarJ);
                            arrayList4.add(aVar3);
                        }
                        z10 = z12;
                        arrayList2 = arrayList6;
                    } else {
                        z10 = z12;
                        arrayList2 = arrayList6;
                        size = -1;
                    }
                } else {
                    boolean z16 = size != i14;
                    if (x3(aVar3)) {
                        if (!z16) {
                            boolean z17 = ((TL_iv.pageBlockDetails) aVar3.f47028b).open;
                            if (!arrayList6.isEmpty() || z17) {
                                if (z13) {
                                    b51Var.L();
                                    z13 = false;
                                }
                            } else if (!z13) {
                                b51Var.M();
                                z13 = true;
                            }
                            x2 x2Var = p3Var.f47341d4;
                            int i17 = p0.f47329a;
                            n41 n41VarJ2 = n41.J(p0.class);
                            n41VarJ2.G = aVar3;
                            n41VarJ2.H = x2Var;
                            arrayList.add(n41VarJ2);
                            arrayList4.add(aVar3);
                            if (!z17) {
                                size = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(aVar3);
                    } else if (!z16) {
                        if (aVar2 != null) {
                            ArrayList arrayList8 = aVar2.f47035k;
                            int size2 = arrayList8.size();
                            int i18 = 0;
                            while (true) {
                                z10 = z12;
                                if (i18 >= size2 || i18 >= arrayList7.size()) {
                                    arrayList2 = arrayList6;
                                    break;
                                }
                                arrayList2 = arrayList6;
                                if (!((Long) arrayList8.get(i18)).equals(arrayList7.get(i18))) {
                                    break;
                                }
                                i18++;
                                z12 = z10;
                                arrayList6 = arrayList2;
                            }
                            int i19 = size2 - 1;
                            while (i19 >= i18) {
                                Long l10 = (Long) arrayList8.get(i19);
                                l10.getClass();
                                Integer num = (Integer) map.get(l10);
                                if (num != null && (num.intValue() >= 2 || i19 > 0 || p3Var.f47350i3.containsKey(l10))) {
                                    if (!z13) {
                                        break;
                                    }
                                    b51Var.L();
                                    z13 = false;
                                    break;
                                }
                                i19--;
                                i18 = i18;
                            }
                        } else {
                            z10 = z12;
                            arrayList2 = arrayList6;
                        }
                        if (aVar2 != null) {
                            p3Var.s3(aVar2, arrayList7, map, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (!z13) {
                                b51Var.M();
                                z13 = true;
                            }
                        } else if (z13) {
                            b51Var.L();
                            z13 = false;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.f47028b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            l2 l2Var = p3Var.R3;
                            int i20 = t0.f47455a;
                            n41 n41VarJ3 = n41.J(t0.class);
                            n41VarJ3.G = aVar3;
                            n41VarJ3.H = l2Var;
                            arrayList.add(n41VarJ3);
                        } else if (D3(pageBlock)) {
                            i3 i3Var = p3Var.S3;
                            int i21 = l4.f47260a;
                            n41 n41VarJ4 = n41.J(l4.class);
                            n41VarJ4.d = (int) aVar3.f47027a;
                            n41VarJ4.G = aVar3;
                            n41VarJ4.H = i3Var;
                            arrayList.add(n41VarJ4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.f47028b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                j3 j3Var = p3Var.T3;
                                int i22 = w.f47524a;
                                n41 n41VarJ5 = n41.J(w.class);
                                n41VarJ5.G = aVar3;
                                n41VarJ5.H = j3Var;
                                arrayList.add(n41VarJ5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                k3 k3Var = p3Var.U3;
                                int i23 = v0.f47512a;
                                n41 n41VarJ6 = n41.J(v0.class);
                                n41VarJ6.G = aVar3;
                                n41VarJ6.H = k3Var;
                                arrayList.add(n41VarJ6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                l3 l3Var = p3Var.Z3;
                                int i24 = f4.f47142a;
                                n41 n41VarJ7 = n41.J(f4.class);
                                n41VarJ7.G = aVar3;
                                n41VarJ7.H = l3Var;
                                arrayList.add(n41VarJ7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                u2 u2Var = p3Var.f47335a4;
                                int i25 = h4.f47182a;
                                n41 n41VarJ8 = n41.J(h4.class);
                                n41VarJ8.G = aVar3;
                                n41VarJ8.H = u2Var;
                                arrayList.add(n41VarJ8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                w2 w2Var = p3Var.f47339c4;
                                int i26 = e5.f47128a;
                                n41 n41VarJ9 = n41.J(e5.class);
                                n41VarJ9.G = aVar3;
                                n41VarJ9.H = w2Var;
                                arrayList.add(n41VarJ9);
                            } else {
                                if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                    h3 h3Var = p3Var.Q3;
                                    int i27 = d0.f47098a;
                                    n41 n41VarJ10 = n41.J(d0.class);
                                    n41VarJ10.G = aVar3;
                                    n41VarJ10.H = h3Var;
                                    arrayList.add(n41VarJ10);
                                } else {
                                    aVar3.f47040p = i15 == 0;
                                    aVar3.f47041q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                    boolean z18 = arrayList3.size() == 2 && i15 == 1 && (aVar3.f47028b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).f47028b instanceof TL_iv.pageBlockHeading1);
                                    y2 y2Var = p3Var.f47353j4;
                                    int i28 = r5.f47413a;
                                    n41 n41VarJ11 = n41.J(r5.class);
                                    n41VarJ11.G = aVar3;
                                    n41VarJ11.H = y2Var;
                                    n41VarJ11.f30850r = z18;
                                    arrayList.add(n41VarJ11);
                                }
                                arrayList4.add(aVar3);
                                aVar2 = aVar3;
                            }
                        }
                        arrayList4.add(aVar3);
                        aVar2 = aVar3;
                    }
                    z10 = z12;
                    arrayList2 = arrayList6;
                }
                i15++;
                z12 = z10;
                arrayList6 = arrayList2;
                i10 = 1;
                i14 = -1;
            }
            if (z13) {
                b51Var.L();
            }
            if (aVar2 != null) {
                p3Var.s3(aVar2, f47334o4, map, arrayList);
            }
            int i29 = 0;
            while (i29 < arrayList4.size()) {
                a aVar4 = (a) arrayList4.get(i29);
                aVar4.f47038n = false;
                aVar4.f47039o = false;
                aVar4.f47036l = 0;
                aVar4.f47037m = 0;
                int size3 = aVar4.f47035k.size();
                if (size3 != 0) {
                    a aVar5 = i29 > 0 ? (a) arrayList4.get(i29 - 1) : null;
                    int i30 = i29 + 1;
                    a aVar6 = i30 < arrayList4.size() ? (a) arrayList4.get(i30) : null;
                    aVar4.f47036l = size3 - l4(aVar4, aVar5);
                    int iL4 = size3 - l4(aVar4, aVar6);
                    aVar4.f47037m = iL4;
                    aVar4.f47038n = aVar4.f47036l > 0;
                    aVar4.f47039o = iL4 > 0;
                }
                i29++;
            }
        }
    }

    public static void J2(ArrayList arrayList, a aVar) {
        TLRPC.Document document;
        TL_iv.PageBlock pageBlock;
        TL_iv.PageBlock pageBlock2 = aVar.f47028b;
        if (pageBlock2 instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock2);
            return;
        }
        if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.f47032g;
            if (sVar == null || !sVar.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = aVar.f47028b;
            if (((TL_iv.pageBlockPhoto) pageBlock3).photo_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    aVar.f47028b.caption.text = new TL_iv.textEmpty();
                    aVar.f47028b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.f47028b);
                return;
            }
            return;
        }
        if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.f47032g;
            if (sVar2 == null || !sVar2.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock4 = aVar.f47028b;
            if (((TL_iv.pageBlockVideo) pageBlock4).video_id != 0) {
                if (pageBlock4.caption == null) {
                    pageBlock4.caption = new TL_iv.PageCaption();
                    aVar.f47028b.caption.text = new TL_iv.textEmpty();
                    aVar.f47028b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.f47028b);
                return;
            }
            return;
        }
        if (B3(pageBlock2)) {
            ArrayList arrayListG3 = g3(aVar.f47028b);
            List listQ3 = Q3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i10 = 0; arrayListG3 != null && i10 < arrayListG3.size() && i10 < listQ3.size(); i10++) {
                TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) arrayListG3.get(i10);
                if (((s) listQ3.get(i10)).b()) {
                    if ((pageBlock5 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock5).photo_id : pageBlock5 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock5).video_id : 0L) != 0) {
                        h0.d(pageBlock5);
                        arrayList2.add(pageBlock5);
                    }
                }
            }
            if (arrayList2.size() < 2) {
                if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                    return;
                }
                return;
            }
            if (aVar.f47028b instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                pageblockslideshow.items = arrayList2;
                pageblockslideshow.caption = aVar.f47028b.caption;
                pageBlock = pageblockslideshow;
            } else {
                TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                pageblockcollage.items = arrayList2;
                pageblockcollage.caption = aVar.f47028b.caption;
                pageBlock = pageblockcollage;
            }
            h0.d(pageBlock);
            arrayList.add(pageBlock);
            return;
        }
        TL_iv.PageBlock pageBlock6 = aVar.f47028b;
        if (pageBlock6 instanceof TL_iv.pageBlockAudio) {
            s sVar3 = aVar.f47032g;
            if (sVar3 == null || !sVar3.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = aVar.f47028b;
            if (((TL_iv.pageBlockAudio) pageBlock7).audio_id != 0) {
                if (pageBlock7.caption == null) {
                    pageBlock7.caption = new TL_iv.PageCaption();
                    aVar.f47028b.caption.text = new TL_iv.textEmpty();
                    aVar.f47028b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.f47028b);
                return;
            }
            return;
        }
        if (pageBlock6 instanceof TL_iv.pageBlockDocument) {
            s sVar4 = aVar.f47032g;
            if (sVar4 != null && (document = sVar4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock6).document_id = document.f22386id;
            }
            if (sVar4 == null || !sVar4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock8 = aVar.f47028b;
            if (((TL_iv.pageBlockDocument) pageBlock8).document_id != 0) {
                h0.d(pageBlock8);
                arrayList.add(aVar.f47028b);
                return;
            }
            return;
        }
        if (pageBlock6 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock6;
            int i11 = g4.I;
            if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                if (pageblockmap.caption == null) {
                    TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                    pageblockmap.caption = pageCaption;
                    pageCaption.text = new TL_iv.textEmpty();
                    pageblockmap.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(pageblockmap);
                return;
            }
            return;
        }
        if (pageBlock6 instanceof TL_iv.pageBlockMath) {
            if (TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock6).source)) {
                return;
            }
            arrayList.add(aVar.f47028b);
            return;
        }
        if (!(pageBlock6 instanceof TL_iv.pageBlockTable)) {
            if (!(pageBlock6 instanceof TL_iv.pageBlockButtonRow)) {
                arrayList.add(pageBlock6);
                return;
            }
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock6;
            ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(pageblockbuttonrow);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock6;
        if (pageblocktable.title == null) {
            pageblocktable.title = new TL_iv.textEmpty();
        }
        if (pageblocktable.rows != null) {
            for (int i12 = 0; i12 < pageblocktable.rows.size(); i12++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i12);
                if (pagetablerow.cells != null) {
                    for (int i13 = 0; i13 < pagetablerow.cells.size(); i13++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i13);
                        if (pagetablecell.text == null) {
                            x5.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                    }
                }
            }
        }
        if (O4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void K1(p3 p3Var, int i10, int i11, int i12) {
        if (i10 < 0) {
            return;
        }
        KeyEvent.Callback callbackM = p3Var.T2.m(i10);
        if (callbackM instanceof t5) {
            t5 t5Var = (t5) callbackM;
            d1 authorEditText = (i11 == 1 && t5Var.n()) ? t5Var.getAuthorEditText() : t5Var.getEditText();
            authorEditText.s();
            authorEditText.setSelection(Math.max(0, Math.min(i12, authorEditText.length())));
            return;
        }
        if (!(callbackM instanceof g5)) {
            if (callbackM instanceof i0) {
                d1 captionEditText = ((i0) callbackM).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
                return;
            }
            return;
        }
        g5 g5Var = (g5) callbackM;
        d1 d1VarL = g5Var.l(i11);
        if (d1VarL == null) {
            d1VarL = g5Var.l(0);
        }
        if (d1VarL == null) {
            return;
        }
        d1VarL.s();
        d1VarL.setSelection(Math.max(0, Math.min(i12, d1VarL.length())));
    }

    public static boolean K2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static TL_iv.PageBlock L1(p3 p3Var, a aVar, int i10, int i11) {
        TL_iv.PageBlock pageBlockTLdeserialize;
        p3Var.getClass();
        if (!A3(aVar.f47028b)) {
            return null;
        }
        Editable editableM4 = p3Var.M4(aVar);
        int length = editableM4.length();
        int iMax = Math.max(0, Math.min(i10, length));
        if (i11 >= 0) {
            length = Math.max(0, Math.min(i11, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editableM4.subSequence(Math.min(iMax, length), Math.max(iMax, length)));
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        if (pageBlock != null) {
            try {
                L2(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                pageBlockTLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
                if (pageBlockTLdeserialize == null) {
                    pageBlockTLdeserialize = new TL_iv.pageBlockParagraph();
                    pageBlockTLdeserialize.text = new TL_iv.textEmpty();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        } else {
            pageBlockTLdeserialize = new TL_iv.pageBlockParagraph();
            pageBlockTLdeserialize.text = new TL_iv.textEmpty();
        }
        t5.e(pageBlockTLdeserialize, spannableStringBuilder);
        return pageBlockTLdeserialize;
    }

    public static void L2(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static void M1(p3 p3Var, d1 d1Var) {
        if (d1Var == null) {
            p3Var.getClass();
            return;
        }
        d1Var.adaptiveCreateLinkDialog = p3Var.f47344f3;
        d1Var.setInlineButtonContext(p3Var.f47336b3);
        d1Var.setInlineButtonClickListener(new m2(p3Var));
    }

    public static void N1(a aVar, s sVar, p3 p3Var) {
        n3 n3Var = p3Var.f47340d3;
        IdentityHashMap identityHashMap = p3Var.W3;
        IdentityHashMap identityHashMap2 = p3Var.V3;
        if (sVar != null) {
            s4 s4Var = (s4) identityHashMap2.remove(sVar);
            if (s4Var != null) {
                s4Var.b();
            }
            o4 o4Var = (o4) identityHashMap.remove(sVar);
            if (o4Var != null) {
                o4Var.a();
            }
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            p3Var.q4(aVar, sVar);
            b2 b2Var2 = p3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            n3Var.onContentChanged();
            return;
        }
        ArrayList arrayList = p3Var.f47348h3;
        for (s sVar2 : Q3(aVar)) {
            s4 s4Var2 = (s4) identityHashMap2.remove(sVar2);
            if (s4Var2 != null) {
                s4Var2.b();
            }
            o4 o4Var2 = (o4) identityHashMap.remove(sVar2);
            if (o4Var2 != null) {
                o4Var2.a();
            }
        }
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf >= 0) {
            b2 b2Var3 = p3Var.F3;
            if (b2Var3 != null) {
                b2Var3.d();
            }
            arrayList.remove(iIndexOf);
            p3Var.U2.N(true);
            b2 b2Var4 = p3Var.F3;
            if (b2Var4 != null) {
                b2Var4.h();
            }
        }
        n3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        S1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    O2(arrayList, pageBlock, i10 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                    } else {
                        a aVar = new a(pageBlock, i10, i11);
                        aVar.f47030e = z11;
                        aVar.f47031f = z12;
                        arrayList.add(aVar);
                    }
                    z13 = true;
                }
            }
        }
        if (z13) {
            return;
        }
        S1(arrayList, null, i10, i11, z11, z12);
    }

    public static TL_iv.PageBlock N3(a aVar, s sVar) {
        if (!B3(aVar.f47028b)) {
            return aVar.f47028b;
        }
        ArrayList arrayListG3 = g3(aVar.f47028b);
        ArrayList arrayList = aVar.h;
        int iIndexOf = arrayList != null ? arrayList.indexOf(sVar) : -1;
        if (iIndexOf < 0 || arrayListG3 == null || iIndexOf >= arrayListG3.size()) {
            return null;
        }
        return (TL_iv.PageBlock) arrayListG3.get(iIndexOf);
    }

    public static void O1(p3 p3Var) {
        if (p3Var.E3) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        p3Var.f47340d3.h0();
        p3Var.o4();
    }

    public static void O2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i11 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    S1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    N2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
                }
            }
            return;
        }
        ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
        int size2 = arrayList3.size();
        int i12 = 1;
        while (i11 < size2) {
            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i11);
            i11++;
            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                S1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i13 = i12;
                N2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i12 = i13;
            }
            i12++;
        }
    }

    public static boolean O4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(v5.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!x5.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(p3 p3Var, a aVar) {
        ArrayList arrayList = p3Var.f47348h3;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f47035k.addAll(aVar.f47035k);
        arrayList.add(iIndexOf + 1, aVar2);
        p3Var.s4();
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.post(new i2(p3Var, aVar2, 23));
    }

    public static FrameLayout P4(g5 g5Var, boolean z10) {
        j5 j5VarM;
        x5 model = g5Var.getModel();
        if (model != null) {
            int i10 = Integer.MAX_VALUE;
            int i11 = z10 ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : g5Var.getSelectedCells()) {
                int iA = model.a(pagetablecell2);
                int iO = z10 ? (x5.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (z10) {
                    if (iO > i11 || (iO == i11 && iA < i10)) {
                        pagetablecell = pagetablecell2;
                        i10 = iA;
                        i11 = iO;
                    }
                } else if (iO < i11 || (iO == i11 && iA < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = iA;
                    i11 = iO;
                }
            }
            if (pagetablecell != null && (j5VarM = g5Var.getGrid().m(pagetablecell)) != null) {
                return j5VarM;
            }
        }
        return g5Var;
    }

    public static boolean Q1(rh.p3 r16, rh.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: rh.p3.Q1(rh.p3, rh.a, boolean):boolean");
    }

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.f47028b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        s sVar = aVar.f47032g;
        return sVar != null ? Collections.singletonList(sVar) : Collections.EMPTY_LIST;
    }

    public static d1 R3(View view) {
        if (view instanceof t5) {
            return ((t5) view).getEditText();
        }
        if (view instanceof i0) {
            return ((i0) view).getCaptionEditText();
        }
        if (view instanceof q0) {
            return ((q0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.f47030e = z10;
        aVar.f47031f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock S3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            return pageBlock instanceof TL_iv.pageBlockFooter ? new TL_iv.pageBlockFooter() : new TL_iv.pageBlockParagraph();
        }
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        return pageblockpreformatted;
    }

    public static s T3(MediaController.PhotoEntry photoEntry, String str) {
        s sVar = new s();
        sVar.f47415b = photoEntry.isVideo;
        sVar.f47417e = str;
        sVar.f47421j = photoEntry.width;
        sVar.f47422k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        boolean z10 = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        sVar.f47423l = z10 ? 0 : photoEntry.orientation;
        sVar.f47424m = z10 ? 0 : photoEntry.invert;
        sVar.f47414a = 1;
        sVar.f47418f = 0.0f;
        return sVar;
    }

    public static g5 U2(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof g5) {
                return (g5) parent;
            }
        }
        return null;
    }

    public static void W2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
        TL_iv.RichText richText;
        if (arrayList2 == null) {
            return;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                O2(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new a(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                W2(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar.f47033i = true;
                arrayList.add(aVar);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long jA = m0.a();
                W2(arrayList, pageblockblockquoteblocks.blocks, map);
                for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                    ((a) arrayList.get(size3)).f47035k.add(0, Long.valueOf(jA));
                }
                if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                    map.put(Long.valueOf(jA), pageblockblockquoteblocks.caption);
                }
            } else {
                arrayList.add(new a(pageBlock, 0, 0));
            }
        }
    }

    public static ArrayList X2(TL_iv.RichMessage richMessage, HashMap map) {
        ArrayList arrayList = new ArrayList();
        W2(arrayList, richMessage.blocks, map);
        return arrayList;
    }

    public static void Z1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] a5(g5 g5Var) {
        x5 x5Var = g5Var.B;
        for (int size = x5Var != null ? x5Var.f47593g.size() : 0; size >= 0; size--) {
            d1 d1VarL = g5Var.l(size);
            int length = d1VarL != null ? d1VarL.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static ArrayList g3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean h4(d1 d1Var, float f10, float f11) {
        if (d1Var != null && d1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            d1Var.getLocationOnScreen(iArr);
            float f12 = f10 - iArr[0];
            float f13 = f11 - iArr[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= d1Var.getWidth() && f13 <= d1Var.getHeight()) {
                int offsetForPosition = d1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                d1Var.s();
                d1Var.setSelection(Math.max(0, Math.min(offsetForPosition, d1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int k4(int i10, a aVar, boolean z10) {
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        return org.telegram.messenger.y1.D(16.0f, Math.max(0, i10 - (aVar.f47035k.size() - (z10 ? aVar.f47036l : aVar.f47037m))), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || D3(pageBlock);
    }

    public static int l4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f47035k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f47035k;
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < iMin && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                ((t5) childAt).setLocked(z10);
            } else if (childAt instanceof g5) {
                ((g5) childAt).setLocked(z10);
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof q0) {
                ((q0) childAt).setLocked(z10);
            } else if (childAt instanceof u0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean v3(int i10) {
        return i10 == 21 || i10 == 22 || i10 == 19 || i10 == 20;
    }

    public static int w2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        return i10 == 32768 ? 16388 : 4;
    }

    public static boolean x3(a aVar) {
        return aVar != null && (aVar.f47028b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !t5.z(pageBlock).isEmpty()) ? false : true;
    }

    @Override
    public final boolean A1() {
        return this.P3;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f47348h3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (photo = sVar.f47419g) != null && hashSet.add(Long.valueOf(photo.f22404id))) {
                    arrayList.add(sVar.f47419g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View A4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.T2.m(i10);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47348h3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (photo = sVar.f47419g) != null && hashSet.add(Long.valueOf(photo.f22404id))) {
                    arrayList.add(sVar.f47419g);
                }
            }
            i10++;
        }
    }

    public final int[] B4() {
        ArrayList arrayList = this.f47348h3;
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y()) {
            a aVarQ2 = Q2();
            int iIndexOf = aVarQ2 != null ? arrayList.indexOf(aVarQ2) : -1;
            if (iIndexOf >= 0) {
                return new int[]{iIndexOf, iIndexOf};
            }
            return null;
        }
        int iIndexOf2 = arrayList.indexOf(y4(d3Var.f24540u0));
        int iIndexOf3 = arrayList.indexOf(y4(d3Var.f24543x0));
        if (iIndexOf2 < 0 || iIndexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(iIndexOf2, iIndexOf3), Math.max(iIndexOf2, iIndexOf3)};
    }

    @Override
    public final void C1() {
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.V0();
        }
    }

    public final void C2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        ArrayList arrayList = this.f47348h3;
        SpannableStringBuilder spannableStringBuilderK = u4.k(arrayList);
        G2();
        arrayList.clear();
        HashMap map = this.f47350i3;
        map.clear();
        this.f47346g3 = null;
        W2(arrayList, u4.b(spannableStringBuilderK), map);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.onContentChanged();
            n3Var.J1();
        }
    }

    public final boolean C4() {
        int iI2;
        int i10;
        int i11;
        d3 d3Var = this.f47352j3;
        if (d3Var != null && d3Var.y()) {
            if (L3()) {
                int i12 = d3Var.f24540u0;
                int i13 = d3Var.f24541v0;
                int i14 = d3Var.f24544y0;
                int i15 = d3Var.f24542w0;
                int i16 = d3Var.f24545z0;
                int i17 = i13;
                while (i17 <= i14) {
                    d1 d1VarN4 = N4(i12, i17);
                    if (d1VarN4 != null) {
                        int length = d1VarN4.length();
                        int iMin = i17 == i13 ? i15 : 0;
                        int iMax = i17 == i14 ? i16 : length;
                        if (i13 == i14) {
                            iMin = Math.min(i15, i16);
                            iMax = Math.max(i15, i16);
                        }
                        if (Math.max(0, Math.min(iMin, length)) < Math.max(0, Math.min(iMax, length))) {
                            return true;
                        }
                    }
                    i17++;
                }
            } else if (y3()) {
                d1 d1VarI2 = I2(d3Var.f24540u0);
                if (d1VarI2 != null && Math.max(0, Math.min(Math.min(d3Var.f24542w0, d3Var.f24545z0), d1VarI2.length())) < Math.max(0, Math.min(Math.max(d3Var.f24542w0, d3Var.f24545z0), d1VarI2.length()))) {
                    return true;
                }
            } else if (w3()) {
                d1 d1VarS2 = s2(d3Var.f24540u0);
                if (d1VarS2 != null) {
                    int i18 = d3Var.f24542w0;
                    int i19 = d3Var.f24545z0;
                    if (Math.max(0, Math.min(Math.min(i18, i19), d1VarS2.length())) < Math.max(0, Math.min(Math.max(i18, i19), d1VarS2.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                d1 d1VarJ4 = j4(d3Var.f24540u0);
                if (d1VarJ4 != null) {
                    int i20 = d3Var.f24542w0;
                    int i21 = d3Var.f24545z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), d1VarJ4.length())) < Math.max(0, Math.min(Math.max(i20, i21), d1VarJ4.length()))) {
                        return true;
                    }
                }
            } else {
                int i22 = d3Var.f24540u0;
                int i23 = d3Var.f24543x0;
                int i24 = d3Var.f24542w0;
                int i25 = d3Var.f24545z0;
                if (i22 >= 0 && i23 >= 0 && i23 >= i22 && i23 < this.f47357l4.size()) {
                    for (int i26 = i22; i26 <= i23; i26++) {
                        a aVarY4 = y4(i26);
                        if (aVarY4 != null) {
                            if (aVarY4.f47044t == 0) {
                                TL_iv.PageBlock pageBlock = aVarY4.f47028b;
                                if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                    iI2 = i2(i26);
                                    if (i26 == i22) {
                                        i10 = i24;
                                    } else {
                                        i10 = 0;
                                    }
                                    if (i26 == i23) {
                                        i11 = i25;
                                    } else {
                                        i11 = iI2;
                                    }
                                    if (Math.max(0, Math.min(i10, iI2)) < Math.max(0, Math.min(i11, iI2))) {
                                        return true;
                                    }
                                }
                            } else {
                                iI2 = i2(i26);
                                if (i26 == i22) {
                                    i10 = i24;
                                } else {
                                    i10 = 0;
                                }
                                if (i26 == i23) {
                                    i11 = i25;
                                } else {
                                    i11 = iI2;
                                }
                                if (Math.max(0, Math.min(i10, iI2)) < Math.max(0, Math.min(i11, iI2))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void D1() {
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.q1();
        }
        x4();
    }

    public final a D2() {
        int i10;
        a aVarY4;
        a aVarQ2 = Q2();
        if (aVarQ2 != null) {
            return aVarQ2;
        }
        d3 d3Var = this.f47352j3;
        if (d3Var == null || (i10 = d3Var.f24540u0) < 0 || (aVarY4 = y4(i10)) == null) {
            return null;
        }
        return aVarY4;
    }

    public final int[] D4() {
        d3 d3Var = this.f47352j3;
        if (d3Var == null) {
            return null;
        }
        int i10 = d3Var.f24540u0;
        int i11 = d3Var.f24543x0;
        if (i10 < 0 || i11 < 0) {
            return null;
        }
        a aVarY4 = y4(i10);
        a aVarY5 = y4(i11);
        if (aVarY4 == null || aVarY5 == null) {
            return null;
        }
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = arrayList.indexOf(aVarY4);
        int iIndexOf2 = arrayList.indexOf(aVarY5);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return null;
        }
        if (iIndexOf > iIndexOf2) {
            iIndexOf = iIndexOf2;
            iIndexOf2 = iIndexOf;
        }
        return new int[]{iIndexOf, iIndexOf2};
    }

    @Override
    public final void E1(f2.o1 o1Var) {
        n3 n3Var = this.f47340d3;
        if (n3Var == null || o1Var == null) {
            return;
        }
        View view = o1Var.f5789a;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view.getWidth();
        this.P3 = n3Var.l(view.getHeight() + iArr[1]);
    }

    public final void E2() {
        ArrayList arrayList;
        d3 d3Var = this.f47352j3;
        int i10 = d3Var.f24540u0;
        int i11 = d3Var.f24542w0;
        int i12 = d3Var.f24543x0;
        if (W1(i10, i11, i12, d3Var.f24545z0, new String[]{""})) {
            return;
        }
        if (i10 > i12) {
            i12 = i10;
            i10 = i12;
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(0, i10);
        while (true) {
            arrayList = this.f47348h3;
            if (iMax > i12) {
                break;
            }
            ArrayList arrayList3 = this.f47357l4;
            if (iMax >= arrayList3.size()) {
                break;
            }
            a aVar = (a) arrayList3.get(iMax);
            if (aVar.f47044t == 0 && arrayList.indexOf(aVar) >= 0) {
                arrayList2.add(aVar);
            }
            iMax++;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        int iIndexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap map = this.f47350i3;
        if (!map.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                hashSet.addAll(((a) arrayList.get(i13)).f47035k);
            }
            map.keySet().retainAll(hashSet);
        }
        x2();
        V3();
        s4();
        d3Var.f(false);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, (a) arrayList.get(Math.max(0, Math.min(iIndexOf, arrayList.size() - 1))), 0));
    }

    public final void E4(d1 d1Var) {
        d1Var.adaptiveCreateLinkDialog = this.f47344f3;
        d1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void F1(f2.o1 o1Var) {
        a aVar = this.O3;
        this.O3 = null;
        this.P3 = false;
        if (aVar == null) {
            if (o1Var != null) {
                View view = o1Var.f5789a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        r4(aVar);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.onContentChanged();
        }
    }

    public final boolean F2() {
        d3 d3Var = this.f47352j3;
        if (d3Var != null && d3Var.y()) {
            d3Var.f(false);
            return true;
        }
        if (this.f47343e4 == null) {
            return false;
        }
        M2();
        return true;
    }

    public final void F4(g5 g5Var) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean zEquals;
        char c10;
        int i12;
        boolean z12;
        boolean z13;
        b70 b70Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iDp;
        FrameLayout frameLayoutP4;
        int[] iArr;
        boolean z14;
        boolean z15;
        b70 b70VarA1;
        int i18;
        int i19;
        int i20;
        final t1[] t1VarArr;
        boolean z16;
        final t1[] t1VarArr2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final int i26;
        final int i27;
        Iterator it;
        boolean z17;
        String string;
        int i28;
        final ?? r10;
        b70 b70Var2;
        int i29;
        boolean z18;
        boolean z19;
        int i30;
        int i31;
        boolean z20;
        boolean zEquals2;
        final g5 g5Var2 = g5Var;
        final x5 model = g5Var2.getModel();
        LinkedHashSet<TL_iv.pageTableCell> linkedHashSet = g5Var2.D;
        if (model == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = model.f47588a;
        Set<TL_iv.pageTableCell> selectedCells = g5Var2.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        if (size >= 2) {
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax = -1;
            int iMax2 = -1;
            for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                int iB = model.b(pagetablecell);
                int iA = model.a(pagetablecell);
                int iO = x5.o(pagetablecell);
                int i32 = pagetablecell.colspan;
                if (i32 == 0) {
                    i32 = 1;
                }
                iMin = Math.min(iMin, iB);
                iMin2 = Math.min(iMin2, iA);
                iMax = Math.max(iMax, (iB + iO) - 1);
                iMax2 = Math.max(iMax2, (iA + i32) - 1);
            }
            HashSet hashSet = new HashSet();
            loop1: while (true) {
                if (iMin > iMax) {
                    zEquals2 = hashSet.equals(new HashSet(selectedCells));
                    break;
                }
                for (int i33 = iMin2; i33 <= iMax2; i33++) {
                    if (iMin < 0 || i33 < 0 || iMin >= model.f47589b || i33 >= model.f47590c) {
                        zEquals2 = false;
                        break loop1;
                    }
                    hashSet.add(model.d[iMin][i33]);
                }
                iMin++;
            }
            if (zEquals2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (size == 1) {
            TL_iv.pageTableCell next = selectedCells.iterator().next();
            if (x5.n(next) > 1) {
                z20 = true;
            } else {
                int i34 = next.rowspan;
                if (i34 == 0) {
                    i34 = 1;
                }
                if (i34 > 1) {
                    z20 = true;
                } else {
                    z20 = false;
                }
            }
            if (z20) {
                i11 = 1;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        HashSet hashSet2 = new HashSet();
        Iterator<TL_iv.pageTableCell> it2 = selectedCells.iterator();
        while (it2.hasNext()) {
            hashSet2.add(Integer.valueOf(model.b(it2.next())));
        }
        if (!hashSet2.isEmpty()) {
            Iterator it3 = hashSet2.iterator();
            loop18: while (true) {
                if (!it3.hasNext()) {
                    z10 = true;
                    break;
                }
                int iIntValue = ((Integer) it3.next()).intValue();
                if (iIntValue >= 0 && iIntValue < model.f47589b) {
                    int i35 = 0;
                    while (true) {
                        if (i35 < model.f47590c) {
                            if (model.f47591e[iIntValue][i35] == iIntValue && selectedCells.contains(model.d[iIntValue][i35])) {
                                i35++;
                            }
                        }
                    }
                }
                z10 = false;
                break loop18;
            }
        }
        z10 = false;
        break loop18;
        HashSet hashSet3 = new HashSet();
        Iterator<TL_iv.pageTableCell> it4 = selectedCells.iterator();
        while (it4.hasNext()) {
            hashSet3.add(Integer.valueOf(model.a(it4.next())));
        }
        if (!hashSet3.isEmpty()) {
            Iterator it5 = hashSet3.iterator();
            loop16: while (true) {
                if (!it5.hasNext()) {
                    z11 = true;
                    break;
                }
                int iIntValue2 = ((Integer) it5.next()).intValue();
                if (iIntValue2 >= 0 && iIntValue2 < model.f47590c) {
                    int i36 = 0;
                    while (true) {
                        if (i36 < model.f47589b) {
                            if (model.f47592f[i36][iIntValue2] == iIntValue2 && selectedCells.contains(model.d[i36][iIntValue2])) {
                                i36++;
                            }
                        }
                    }
                }
                z11 = false;
                break loop16;
            }
        }
        z11 = false;
        break loop16;
        if (selectedCells.isEmpty() || model.f47589b <= 0 || model.f47590c <= 0) {
            zEquals = false;
        } else {
            HashSet hashSet4 = new HashSet();
            for (int i37 = 0; i37 < model.f47589b; i37++) {
                for (int i38 = 0; i38 < model.f47590c; i38++) {
                    hashSet4.add(model.d[i37][i38]);
                }
            }
            zEquals = hashSet4.equals(new HashSet(selectedCells));
        }
        boolean z21 = !zEquals || (model.f47589b == 1 && model.f47590c == 1);
        if (z10 && !zEquals) {
            HashSet hashSet5 = new HashSet();
            Iterator<TL_iv.pageTableCell> it6 = selectedCells.iterator();
            while (it6.hasNext()) {
                hashSet5.add(Integer.valueOf(model.b(it6.next())));
            }
            c10 = 1;
            int i39 = hashSet5.size() < model.f47589b ? 1 : 0;
            if (z11 || zEquals) {
                i12 = 0;
            } else {
                HashSet hashSet6 = new HashSet();
                Iterator<TL_iv.pageTableCell> it7 = selectedCells.iterator();
                while (it7.hasNext()) {
                    hashSet6.add(Integer.valueOf(model.a(it7.next())));
                }
                if (hashSet6.size() < model.f47590c) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
            }
            if (z21 || !z11 || model.f47590c >= MessagesController.getInstance(this.f47336b3).config.richMessageMaxTableCols.get()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z21 || !z10) {
                z13 = false;
            } else {
                z13 = true;
            }
            b70Var = this.f47345f4;
            if (b70Var != null) {
                this.f47345f4 = null;
                b70Var.u();
            }
            int i40 = i10 + 1 + i11;
            if (z12) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            int i41 = i40 + i13;
            if (z13) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            int i42 = i41 + i14 + i12 + i39;
            if (zEquals) {
                i15 = 3;
            } else {
                i15 = 0;
            }
            int i43 = ((i42 + i15) * 48) + 68;
            i16 = i10;
            if (zEquals) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            iDp = AndroidUtilities.dp(i43 + i17);
            frameLayoutP4 = P4(g5Var2, false);
            iArr = new int[2];
            frameLayoutP4.getLocationOnScreen(iArr);
            if ((iArr[c10] - iDp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                z15 = true;
            } else {
                z15 = true;
                frameLayoutP4 = P4(g5Var2, true);
            }
            b70VarA1 = this.f47340d3.A1(frameLayoutP4);
            b70VarA1.f26992s = 0;
            b70VarA1.f26993t = false;
            b70VarA1.Z = z15;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setMinimumWidth(AndroidUtilities.dp(208.0f));
            linearLayout.setOrientation(1);
            i18 = i12;
            TextView textView = new TextView(getContext());
            textView.setText(LocaleController.getString(R.string.ArticleAlignment));
            textView.setTextSize(1, 12.0f);
            textView.setGravity(17);
            textView.setTextColor(g6.v0(g6.f23423y6, this.f35277l2));
            linearLayout.addView(textView, z5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            i19 = i11;
            i20 = i39;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, z5.q(-2, -2, 17));
            Context context = getContext();
            int i44 = R.drawable.iv_align_horiz_left;
            c6 c6Var = this.f47338c3;
            t1 t1Var = new t1(context, i44, c6Var);
            t1Var.f47459e = 4;
            t1Var.d();
            t1Var.b();
            int i45 = g6.G8;
            t1Var.c(i45);
            boolean z22 = z10;
            linearLayout2.addView(t1Var, z5.n(32, 32));
            t1 t1Var2 = new t1(getContext(), R.drawable.iv_align_horiz_middle, c6Var);
            t1Var2.f47459e = 4;
            t1Var2.d();
            t1Var2.b();
            t1Var2.c(i45);
            linearLayout2.addView(t1Var2, z5.n(32, 32));
            t1 t1Var3 = new t1(getContext(), R.drawable.iv_align_horiz_right, c6Var);
            t1Var3.f47459e = 4;
            t1Var3.d();
            t1Var3.b();
            t1Var3.c(i45);
            t1VarArr = new t1[]{t1Var, t1Var2, t1Var3};
            boolean z23 = z11;
            linearLayout2.addView(t1Var3, z5.n(32, 32));
            z16 = zEquals;
            linearLayout2.addView(new Space(getContext()), z5.n(8, 0));
            t1 t1Var4 = new t1(getContext(), R.drawable.iv_align_vert_top, c6Var);
            t1Var4.f47459e = 4;
            t1Var4.d();
            t1Var4.b();
            t1Var4.c(i45);
            linearLayout2.addView(t1Var4, z5.n(32, 32));
            t1 t1Var5 = new t1(getContext(), R.drawable.iv_align_vert_middle, c6Var);
            t1Var5.f47459e = 4;
            t1Var5.d();
            t1Var5.b();
            t1Var5.c(i45);
            linearLayout2.addView(t1Var5, z5.n(32, 32));
            t1 t1Var6 = new t1(getContext(), R.drawable.iv_align_vert_bottom, c6Var);
            t1Var6.f47459e = 4;
            t1Var6.d();
            t1Var6.b();
            t1Var6.c(i45);
            t1VarArr2 = new t1[]{t1Var4, t1Var5, t1Var6};
            linearLayout2.addView(t1Var6, z5.n(32, 32));
            b70VarA1.q(linearLayout);
            i21 = -1;
            for (TL_iv.pageTableCell pagetablecell2 : linkedHashSet) {
                if (pagetablecell2 != null) {
                    i31 = 0;
                } else if (pagetablecell2.align_right) {
                    i31 = 2;
                } else if (pagetablecell2.align_center) {
                    i31 = 1;
                } else {
                    i31 = 0;
                }
                if (i21 == -1) {
                    if (i21 != i31) {
                        i21 = -1;
                        break;
                    }
                } else {
                    i21 = i31;
                }
            }
            i22 = -1;
            for (TL_iv.pageTableCell pagetablecell3 : linkedHashSet) {
                if (pagetablecell3 != null) {
                    i30 = 0;
                } else if (pagetablecell3.valign_bottom) {
                    i30 = 2;
                } else if (pagetablecell3.valign_middle) {
                    i30 = 1;
                } else {
                    i30 = 0;
                }
                if (i22 == -1) {
                    if (i22 != i30) {
                        i22 = -1;
                        break;
                    }
                } else {
                    i22 = i30;
                }
            }
            for (i23 = 0; i23 < 3; i23++) {
                t1 t1Var7 = t1VarArr[i23];
                if (i23 == i21) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                t1Var7.setSelected(z19);
            }
            for (i25 = 0; i25 < 3; i25++) {
                t1 t1Var8 = t1VarArr2[i25];
                if (i25 == i22) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var8.setSelected(z18);
            }
            for (i26 = 0; i26 < 3; i26++) {
                final int i46 = 0;
                t1VarArr[i26].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i46) {
                            case 0:
                                g5 g5Var3 = g5Var2;
                                i5 i5Var = g5Var3.v;
                                Iterator it8 = g5Var3.D.iterator();
                                while (true) {
                                    boolean zHasNext = it8.hasNext();
                                    int i47 = i26;
                                    if (!zHasNext) {
                                        i5Var.invalidate();
                                        w2 w2Var = g5Var3.A;
                                        if (w2Var != null && g5Var3.f47594a != null) {
                                            w2Var.a();
                                        }
                                        int i48 = 0;
                                        while (i48 < 3) {
                                            t1VarArr[i48].setSelected(i48 == i47);
                                            i48++;
                                        }
                                        break;
                                    } else {
                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it8.next();
                                        x5.k(pagetablecell4, i47);
                                        j5 j5VarM = i5Var.m(pagetablecell4);
                                        if (j5VarM != null && j5VarM.f47227b != null) {
                                            j5VarM.a();
                                            j5VarM.invalidate();
                                        }
                                    }
                                }
                                break;
                            default:
                                g5 g5Var4 = g5Var2;
                                i5 i5Var2 = g5Var4.v;
                                Iterator it9 = g5Var4.D.iterator();
                                while (true) {
                                    boolean zHasNext2 = it9.hasNext();
                                    int i49 = i26;
                                    if (!zHasNext2) {
                                        i5Var2.invalidate();
                                        w2 w2Var2 = g5Var4.A;
                                        if (w2Var2 != null && g5Var4.f47594a != null) {
                                            w2Var2.a();
                                        }
                                        int i50 = 0;
                                        while (i50 < 3) {
                                            t1VarArr[i50].setSelected(i50 == i49);
                                            i50++;
                                        }
                                        break;
                                    } else {
                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it9.next();
                                        x5.m(pagetablecell5, i49);
                                        j5 j5VarM2 = i5Var2.m(pagetablecell5);
                                        if (j5VarM2 != null && j5VarM2.f47227b != null) {
                                            j5VarM2.a();
                                            j5VarM2.invalidate();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            i27 = 0;
            for (i24 = 3; i27 < i24; i24 = 3) {
                final int i47 = 1;
                t1VarArr2[i27].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i47) {
                            case 0:
                                g5 g5Var3 = g5Var2;
                                i5 i5Var = g5Var3.v;
                                Iterator it8 = g5Var3.D.iterator();
                                while (true) {
                                    boolean zHasNext = it8.hasNext();
                                    int i48 = i27;
                                    if (!zHasNext) {
                                        i5Var.invalidate();
                                        w2 w2Var = g5Var3.A;
                                        if (w2Var != null && g5Var3.f47594a != null) {
                                            w2Var.a();
                                        }
                                        int i49 = 0;
                                        while (i49 < 3) {
                                            t1VarArr2[i49].setSelected(i49 == i48);
                                            i49++;
                                        }
                                        break;
                                    } else {
                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it8.next();
                                        x5.k(pagetablecell4, i48);
                                        j5 j5VarM = i5Var.m(pagetablecell4);
                                        if (j5VarM != null && j5VarM.f47227b != null) {
                                            j5VarM.a();
                                            j5VarM.invalidate();
                                        }
                                    }
                                }
                                break;
                            default:
                                g5 g5Var4 = g5Var2;
                                i5 i5Var2 = g5Var4.v;
                                Iterator it9 = g5Var4.D.iterator();
                                while (true) {
                                    boolean zHasNext2 = it9.hasNext();
                                    int i410 = i27;
                                    if (!zHasNext2) {
                                        i5Var2.invalidate();
                                        w2 w2Var2 = g5Var4.A;
                                        if (w2Var2 != null && g5Var4.f47594a != null) {
                                            w2Var2.a();
                                        }
                                        int i50 = 0;
                                        while (i50 < 3) {
                                            t1VarArr2[i50].setSelected(i50 == i410);
                                            i50++;
                                        }
                                        break;
                                    } else {
                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it9.next();
                                        x5.m(pagetablecell5, i410);
                                        j5 j5VarM2 = i5Var2.m(pagetablecell5);
                                        if (j5VarM2 != null && j5VarM2.f47227b != null) {
                                            j5VarM2.a();
                                            j5VarM2.invalidate();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                i27++;
            }
            b70VarA1.o();
            b70VarA1.S = 208;
            if (linkedHashSet.isEmpty()) {
                z17 = false;
                break;
            }
            it = linkedHashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((TL_iv.pageTableCell) it.next()).header) {
                        z17 = false;
                        break;
                    }
                } else {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                string = LocaleController.getString(R.string.ArticleRemoveHighlight);
            } else if (z16 && (size <= 1 || z23 || z22)) {
                string = LocaleController.getString(z23 ? R.string.ArticleHighlightColumn : z22 ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell);
            } else {
                string = LocaleController.getString(R.string.ArticleHighlightCells);
            }
            if (z17) {
                i28 = R.drawable.iv_table_highlight_remove;
            } else {
                i28 = R.drawable.iv_table_highlight;
            }
            b70VarA1.c(i28, string, new op0(this, g5Var2, z17, 13), false);
            if (i16 != 0) {
                final int i48 = 2;
                b70VarA1.c(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i48) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i49 = 0;
                                                for (int i50 = 0; i50 < x5Var.f47589b; i50++) {
                                                    iArr2[i50] = i49;
                                                    if (!zArr[i50]) {
                                                        i49++;
                                                    }
                                                }
                                                if (i49 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i51 = 0;
                                                    while (i51 < size2) {
                                                        Object obj = arrayList.get(i51);
                                                        i51++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i52 = pagetablecell4.colspan;
                                                        if (i52 == 0) {
                                                            i52 = 1;
                                                        }
                                                        int i53 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i54 = 0;
                                                        for (int i55 = iB5; i55 < iB5 + iO2 && i55 < x5Var.f47589b; i55++) {
                                                            if (!zArr[i55]) {
                                                                if (i53 < 0) {
                                                                    i53 = i55;
                                                                }
                                                                i54++;
                                                            }
                                                        }
                                                        if (i53 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], iA3, i54, i52});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i49);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i56 = pagetablecell6.colspan;
                                            if (i56 == 0) {
                                                i56 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i56) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i57 = iMin4;
                                        while (true) {
                                            if (i57 <= iMax3) {
                                                int i58 = iMin7;
                                                while (true) {
                                                    if (i58 > iMax4) {
                                                        i57++;
                                                    } else if (i57 >= 0 && i58 >= 0 && i57 < x5Var2.f47589b && i58 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i57][i58]);
                                                        i58++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i59 = 0;
                                                while (i59 < size3) {
                                                    Object obj2 = arrayList2.get(i59);
                                                    i59++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, false);
            }
            if (i19 != 0) {
                final int i49 = 3;
                b70VarA1.c(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i49) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i50 = 0; i50 < x5Var.f47589b; i50++) {
                                                    iArr2[i50] = i410;
                                                    if (!zArr[i50]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i51 = 0;
                                                    while (i51 < size2) {
                                                        Object obj = arrayList.get(i51);
                                                        i51++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i52 = pagetablecell4.colspan;
                                                        if (i52 == 0) {
                                                            i52 = 1;
                                                        }
                                                        int i53 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i54 = 0;
                                                        for (int i55 = iB5; i55 < iB5 + iO2 && i55 < x5Var.f47589b; i55++) {
                                                            if (!zArr[i55]) {
                                                                if (i53 < 0) {
                                                                    i53 = i55;
                                                                }
                                                                i54++;
                                                            }
                                                        }
                                                        if (i53 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], iA3, i54, i52});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i56 = pagetablecell6.colspan;
                                            if (i56 == 0) {
                                                i56 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i56) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i57 = iMin4;
                                        while (true) {
                                            if (i57 <= iMax3) {
                                                int i58 = iMin7;
                                                while (true) {
                                                    if (i58 > iMax4) {
                                                        i57++;
                                                    } else if (i57 >= 0 && i58 >= 0 && i57 < x5Var2.f47589b && i58 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i57][i58]);
                                                        i58++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i59 = 0;
                                                while (i59 < size3) {
                                                    Object obj2 = arrayList2.get(i59);
                                                    i59++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, false);
            }
            if (z12) {
                final int i50 = 4;
                b70VarA1.c(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i50) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i51 = 0; i51 < x5Var.f47589b; i51++) {
                                                    iArr2[i51] = i410;
                                                    if (!zArr[i51]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i52 = 0;
                                                    while (i52 < size2) {
                                                        Object obj = arrayList.get(i52);
                                                        i52++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i53 = pagetablecell4.colspan;
                                                        if (i53 == 0) {
                                                            i53 = 1;
                                                        }
                                                        int i54 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i55 = 0;
                                                        for (int i56 = iB5; i56 < iB5 + iO2 && i56 < x5Var.f47589b; i56++) {
                                                            if (!zArr[i56]) {
                                                                if (i54 < 0) {
                                                                    i54 = i56;
                                                                }
                                                                i55++;
                                                            }
                                                        }
                                                        if (i54 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], iA3, i55, i53});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i57 = pagetablecell6.colspan;
                                            if (i57 == 0) {
                                                i57 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i57) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i58 = iMin4;
                                        while (true) {
                                            if (i58 <= iMax3) {
                                                int i59 = iMin7;
                                                while (true) {
                                                    if (i59 > iMax4) {
                                                        i58++;
                                                    } else if (i58 >= 0 && i59 >= 0 && i58 < x5Var2.f47589b && i59 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i58][i59]);
                                                        i59++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i510 = 0;
                                                while (i510 < size3) {
                                                    Object obj2 = arrayList2.get(i510);
                                                    i510++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, false);
                final int i51 = 5;
                b70VarA1.c(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i51) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i52 = 0; i52 < x5Var.f47589b; i52++) {
                                                    iArr2[i52] = i410;
                                                    if (!zArr[i52]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i53 = 0;
                                                    while (i53 < size2) {
                                                        Object obj = arrayList.get(i53);
                                                        i53++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i54 = pagetablecell4.colspan;
                                                        if (i54 == 0) {
                                                            i54 = 1;
                                                        }
                                                        int i55 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i56 = 0;
                                                        for (int i57 = iB5; i57 < iB5 + iO2 && i57 < x5Var.f47589b; i57++) {
                                                            if (!zArr[i57]) {
                                                                if (i55 < 0) {
                                                                    i55 = i57;
                                                                }
                                                                i56++;
                                                            }
                                                        }
                                                        if (i55 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i55], iA3, i56, i54});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i58 = pagetablecell6.colspan;
                                            if (i58 == 0) {
                                                i58 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i58) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i59 = iMin4;
                                        while (true) {
                                            if (i59 <= iMax3) {
                                                int i510 = iMin7;
                                                while (true) {
                                                    if (i510 > iMax4) {
                                                        i59++;
                                                    } else if (i59 >= 0 && i510 >= 0 && i59 < x5Var2.f47589b && i510 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i59][i510]);
                                                        i510++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i511 = 0;
                                                while (i511 < size3) {
                                                    Object obj2 = arrayList2.get(i511);
                                                    i511++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, false);
            }
            if (z13) {
                final int i52 = 6;
                b70VarA1.c(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i52) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i53 = 0; i53 < x5Var.f47589b; i53++) {
                                                    iArr2[i53] = i410;
                                                    if (!zArr[i53]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i54 = 0;
                                                    while (i54 < size2) {
                                                        Object obj = arrayList.get(i54);
                                                        i54++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i55 = pagetablecell4.colspan;
                                                        if (i55 == 0) {
                                                            i55 = 1;
                                                        }
                                                        int i56 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i57 = 0;
                                                        for (int i58 = iB5; i58 < iB5 + iO2 && i58 < x5Var.f47589b; i58++) {
                                                            if (!zArr[i58]) {
                                                                if (i56 < 0) {
                                                                    i56 = i58;
                                                                }
                                                                i57++;
                                                            }
                                                        }
                                                        if (i56 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i56], iA3, i57, i55});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i59 = pagetablecell6.colspan;
                                            if (i59 == 0) {
                                                i59 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i59) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i510 = iMin4;
                                        while (true) {
                                            if (i510 <= iMax3) {
                                                int i511 = iMin7;
                                                while (true) {
                                                    if (i511 > iMax4) {
                                                        i510++;
                                                    } else if (i510 >= 0 && i511 >= 0 && i510 < x5Var2.f47589b && i511 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i510][i511]);
                                                        i511++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i512 = 0;
                                                while (i512 < size3) {
                                                    Object obj2 = arrayList2.get(i512);
                                                    i512++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, false);
                final int i53 = 7;
                b70VarA1.c(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i53) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i54 = 0; i54 < x5Var.f47589b; i54++) {
                                                    iArr2[i54] = i410;
                                                    if (!zArr[i54]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i55 = 0;
                                                    while (i55 < size2) {
                                                        Object obj = arrayList.get(i55);
                                                        i55++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i56 = pagetablecell4.colspan;
                                                        if (i56 == 0) {
                                                            i56 = 1;
                                                        }
                                                        int i57 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i58 = 0;
                                                        for (int i59 = iB5; i59 < iB5 + iO2 && i59 < x5Var.f47589b; i59++) {
                                                            if (!zArr[i59]) {
                                                                if (i57 < 0) {
                                                                    i57 = i59;
                                                                }
                                                                i58++;
                                                            }
                                                        }
                                                        if (i57 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i57], iA3, i58, i56});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i510 = pagetablecell6.colspan;
                                            if (i510 == 0) {
                                                i510 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i510) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i511 = iMin4;
                                        while (true) {
                                            if (i511 <= iMax3) {
                                                int i512 = iMin7;
                                                while (true) {
                                                    if (i512 > iMax4) {
                                                        i511++;
                                                    } else if (i511 >= 0 && i512 >= 0 && i511 < x5Var2.f47589b && i512 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i511][i512]);
                                                        i512++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i513 = 0;
                                                while (i513 < size3) {
                                                    Object obj2 = arrayList2.get(i513);
                                                    i513++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, false);
            }
            if (i18 != 0) {
                final int i54 = 8;
                r10 = 1;
                b70VarA1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i54) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i55 = 0; i55 < x5Var.f47589b; i55++) {
                                                    iArr2[i55] = i410;
                                                    if (!zArr[i55]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i56 = 0;
                                                    while (i56 < size2) {
                                                        Object obj = arrayList.get(i56);
                                                        i56++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i57 = pagetablecell4.colspan;
                                                        if (i57 == 0) {
                                                            i57 = 1;
                                                        }
                                                        int i58 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i59 = 0;
                                                        for (int i510 = iB5; i510 < iB5 + iO2 && i510 < x5Var.f47589b; i510++) {
                                                            if (!zArr[i510]) {
                                                                if (i58 < 0) {
                                                                    i58 = i510;
                                                                }
                                                                i59++;
                                                            }
                                                        }
                                                        if (i58 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i58], iA3, i59, i57});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i511 = pagetablecell6.colspan;
                                            if (i511 == 0) {
                                                i511 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i511) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i512 = iMin4;
                                        while (true) {
                                            if (i512 <= iMax3) {
                                                int i513 = iMin7;
                                                while (true) {
                                                    if (i513 > iMax4) {
                                                        i512++;
                                                    } else if (i512 >= 0 && i513 >= 0 && i512 < x5Var2.f47589b && i513 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i512][i513]);
                                                        i513++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i514 = 0;
                                                while (i514 < size3) {
                                                    Object obj2 = arrayList2.get(i514);
                                                    i514++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, true);
            } else {
                r10 = 1;
            }
            if (i20 != 0) {
                final int i55 = 0;
                b70VarA1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (i55) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i56 = 0; i56 < x5Var.f47589b; i56++) {
                                                    iArr2[i56] = i410;
                                                    if (!zArr[i56]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i57 = 0;
                                                    while (i57 < size2) {
                                                        Object obj = arrayList.get(i57);
                                                        i57++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i58 = pagetablecell4.colspan;
                                                        if (i58 == 0) {
                                                            i58 = 1;
                                                        }
                                                        int i59 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i510 = 0;
                                                        for (int i511 = iB5; i511 < iB5 + iO2 && i511 < x5Var.f47589b; i511++) {
                                                            if (!zArr[i511]) {
                                                                if (i59 < 0) {
                                                                    i59 = i511;
                                                                }
                                                                i510++;
                                                            }
                                                        }
                                                        if (i59 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i59], iA3, i510, i58});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i512 = pagetablecell6.colspan;
                                            if (i512 == 0) {
                                                i512 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i512) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i513 = iMin4;
                                        while (true) {
                                            if (i513 <= iMax3) {
                                                int i514 = iMin7;
                                                while (true) {
                                                    if (i514 > iMax4) {
                                                        i513++;
                                                    } else if (i513 >= 0 && i514 >= 0 && i513 < x5Var2.f47589b && i514 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i513][i514]);
                                                        i514++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i515 = 0;
                                                while (i515 < size3) {
                                                    Object obj2 = arrayList2.get(i515);
                                                    i515++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, r10);
            }
            if (z16) {
                b70VarA1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) {

                    public final p3 f47151b;

                    {
                        this.f47151b = this;
                    }

                    @Override
                    public final void run() {
                        p3 p3Var;
                        boolean z24;
                        int iB2;
                        int iB3;
                        int iA2;
                        p3 p3Var2;
                        boolean z25;
                        switch (r10) {
                            case 0:
                                p3 p3Var3 = this.f47151b;
                                p3Var3.getClass();
                                g5 g5Var3 = g5Var2;
                                LinkedHashSet linkedHashSet2 = g5Var3.D;
                                if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                    p3Var = p3Var3;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    int iMin3 = Integer.MAX_VALUE;
                                    while (it8.hasNext()) {
                                        int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iB4));
                                        iMin3 = Math.min(iMin3, iB4);
                                    }
                                    linkedHashSet2.clear();
                                    x5 x5Var = g5Var3.B;
                                    x5Var.getClass();
                                    if (hashSet7.isEmpty()) {
                                        p3Var = p3Var3;
                                        z24 = false;
                                    } else {
                                        boolean[] zArr = new boolean[x5Var.f47589b];
                                        Iterator it9 = hashSet7.iterator();
                                        while (true) {
                                            z24 = true;
                                            if (it9.hasNext()) {
                                                int iIntValue3 = ((Integer) it9.next()).intValue();
                                                if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                    zArr[iIntValue3] = true;
                                                }
                                            } else {
                                                int[] iArr2 = new int[x5Var.f47589b];
                                                int i410 = 0;
                                                for (int i56 = 0; i56 < x5Var.f47589b; i56++) {
                                                    iArr2[i56] = i410;
                                                    if (!zArr[i56]) {
                                                        i410++;
                                                    }
                                                }
                                                if (i410 == 0) {
                                                    x5Var.f47588a.rows.clear();
                                                    x5Var.i();
                                                    p3Var = p3Var3;
                                                } else {
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    ArrayList arrayList = x5Var.f47593g;
                                                    int size2 = arrayList.size();
                                                    int i57 = 0;
                                                    while (i57 < size2) {
                                                        Object obj = arrayList.get(i57);
                                                        i57++;
                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                        int iB5 = x5Var.b(pagetablecell4);
                                                        int iA3 = x5Var.a(pagetablecell4);
                                                        int iO2 = x5.o(pagetablecell4);
                                                        int i58 = pagetablecell4.colspan;
                                                        if (i58 == 0) {
                                                            i58 = 1;
                                                        }
                                                        int i59 = -1;
                                                        p3 p3Var4 = p3Var3;
                                                        int[] iArr3 = iArr2;
                                                        int i510 = 0;
                                                        for (int i511 = iB5; i511 < iB5 + iO2 && i511 < x5Var.f47589b; i511++) {
                                                            if (!zArr[i511]) {
                                                                if (i59 < 0) {
                                                                    i59 = i511;
                                                                }
                                                                i510++;
                                                            }
                                                        }
                                                        if (i59 >= 0) {
                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i59], iA3, i510, i58});
                                                        }
                                                        p3Var3 = p3Var4;
                                                        iArr2 = iArr3;
                                                    }
                                                    p3Var = p3Var3;
                                                    x5Var.j(identityHashMap, i410);
                                                    x5Var.i();
                                                    z24 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var3.v();
                                    if (z24) {
                                        g5Var3.q(iMin3, 0);
                                    }
                                }
                                p3Var.M2();
                                break;
                            case 1:
                                p3 p3Var5 = this.f47151b;
                                p3Var5.getClass();
                                a row = g5Var2.getRow();
                                p3Var5.M2();
                                if (row != null) {
                                    b2 b2Var = p3Var5.F3;
                                    if (b2Var != null) {
                                        b2Var.d();
                                    }
                                    p3Var5.r4(row);
                                    b2 b2Var2 = p3Var5.F3;
                                    if (b2Var2 != null) {
                                        b2Var2.h();
                                    }
                                    n3 n3Var = p3Var5.f47340d3;
                                    if (n3Var != null) {
                                        n3Var.onContentChanged();
                                    }
                                }
                                break;
                            case 2:
                                g5 g5Var4 = g5Var2;
                                LinkedHashSet linkedHashSet3 = g5Var4.D;
                                if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    int iMin6 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                        iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    x5 x5Var2 = g5Var4.B;
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMin7 = Integer.MAX_VALUE;
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iB6 = x5Var2.b(pagetablecell6);
                                            int iA4 = x5Var2.a(pagetablecell6);
                                            int iO3 = x5.o(pagetablecell6);
                                            int i512 = pagetablecell6.colspan;
                                            if (i512 == 0) {
                                                i512 = 1;
                                            }
                                            iMin4 = Math.min(iMin4, iB6);
                                            iMin7 = Math.min(iMin7, iA4);
                                            iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                            iMax4 = Math.max(iMax4, (iA4 + i512) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i513 = iMin4;
                                        while (true) {
                                            if (i513 <= iMax3) {
                                                int i514 = iMin7;
                                                while (true) {
                                                    if (i514 > iMax4) {
                                                        i513++;
                                                    } else if (i513 >= 0 && i514 >= 0 && i513 < x5Var2.f47589b && i514 < x5Var2.f47590c) {
                                                        hashSet9.add(x5Var2.d[i513][i514]);
                                                        i514++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                                int size3 = arrayList2.size();
                                                int i515 = 0;
                                                while (i515 < size3) {
                                                    Object obj2 = arrayList2.get(i515);
                                                    i515++;
                                                    String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                    if (strG.isEmpty()) {
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        if (sb2.length() > 0) {
                                                            sb2.append("\n");
                                                        }
                                                        sb2.append(strG);
                                                    }
                                                    arrayList2 = arrayList2;
                                                }
                                                TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                                int i60 = (iMax4 - iMin7) + 1;
                                                int i61 = (iMax3 - iMin4) + 1;
                                                if (i60 <= 1) {
                                                    i60 = 0;
                                                }
                                                pagetablecell7.colspan = i60;
                                                int i62 = i61 > 1 ? i61 : 0;
                                                pagetablecell7.rowspan = i62;
                                                int i63 = pagetablecell7.flags;
                                                pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                                int i64 = pagetablecell7.flags;
                                                pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                                x5.c(pagetablecell7, sb2.toString());
                                                for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                    if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                        pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                    }
                                                }
                                                x5Var2.i();
                                                g5Var4.v();
                                                g5Var4.v.invalidate();
                                                g5Var4.q(iMin5, iMin6);
                                                g5Var4.t();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 3:
                                g5 g5Var5 = g5Var2;
                                LinkedHashSet linkedHashSet4 = g5Var5.D;
                                if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    if (x5.n(pagetablecell9) > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    } else {
                                        int i65 = pagetablecell9.rowspan;
                                        if (i65 == 0) {
                                            i65 = 1;
                                        }
                                        if (i65 > 1) {
                                            iB3 = g5Var5.B.b(pagetablecell9);
                                            iA2 = g5Var5.B.a(pagetablecell9);
                                            linkedHashSet4.clear();
                                            if (g5Var5.B.p(pagetablecell9)) {
                                                g5Var5.v();
                                                g5Var5.v.invalidate();
                                                g5Var5.q(iB3, iA2);
                                                g5Var5.t();
                                            } else {
                                                linkedHashSet4.add(pagetablecell9);
                                            }
                                        }
                                    }
                                }
                                this.f47151b.M2();
                                break;
                            case 4:
                                g5Var2.i(true);
                                this.f47151b.M2();
                                break;
                            case 5:
                                g5Var2.i(false);
                                this.f47151b.M2();
                                break;
                            case 6:
                                g5Var2.j(true);
                                this.f47151b.M2();
                                break;
                            case 7:
                                g5Var2.j(false);
                                this.f47151b.M2();
                                break;
                            default:
                                p3 p3Var6 = this.f47151b;
                                p3Var6.getClass();
                                g5 g5Var6 = g5Var2;
                                LinkedHashSet linkedHashSet5 = g5Var6.D;
                                if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                    p3Var2 = p3Var6;
                                } else {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    int iMin8 = Integer.MAX_VALUE;
                                    while (it10.hasNext()) {
                                        int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iA5));
                                        iMin8 = Math.min(iMin8, iA5);
                                    }
                                    linkedHashSet5.clear();
                                    x5 x5Var3 = g5Var6.B;
                                    x5Var3.getClass();
                                    if (hashSet10.isEmpty()) {
                                        p3Var2 = p3Var6;
                                        z25 = false;
                                    } else {
                                        boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                        Iterator it11 = hashSet10.iterator();
                                        while (true) {
                                            z25 = true;
                                            if (it11.hasNext()) {
                                                int iIntValue4 = ((Integer) it11.next()).intValue();
                                                if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                    zArr2[iIntValue4] = true;
                                                }
                                            } else {
                                                int[] iArr4 = new int[x5Var3.f47590c];
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                    iArr4[i67] = i66;
                                                    if (!zArr2[i67]) {
                                                        i66++;
                                                    }
                                                }
                                                if (i66 == 0) {
                                                    x5Var3.f47588a.rows.clear();
                                                    x5Var3.i();
                                                    p3Var2 = p3Var6;
                                                } else {
                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                    ArrayList arrayList3 = x5Var3.f47593g;
                                                    int size4 = arrayList3.size();
                                                    int i68 = 0;
                                                    while (i68 < size4) {
                                                        Object obj3 = arrayList3.get(i68);
                                                        i68++;
                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                        int iB7 = x5Var3.b(pagetablecell10);
                                                        int iA6 = x5Var3.a(pagetablecell10);
                                                        int iO4 = x5.o(pagetablecell10);
                                                        int i69 = pagetablecell10.colspan;
                                                        if (i69 == 0) {
                                                            i69 = 1;
                                                        }
                                                        int i70 = -1;
                                                        p3 p3Var7 = p3Var6;
                                                        int[] iArr5 = iArr4;
                                                        boolean[] zArr3 = zArr2;
                                                        int i71 = 0;
                                                        for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                            if (!zArr3[i72]) {
                                                                if (i70 < 0) {
                                                                    i70 = i72;
                                                                }
                                                                i71++;
                                                            }
                                                        }
                                                        if (i70 >= 0) {
                                                            identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                        }
                                                        p3Var6 = p3Var7;
                                                        iArr4 = iArr5;
                                                        zArr2 = zArr3;
                                                    }
                                                    p3Var2 = p3Var6;
                                                    x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                    x5Var3.i();
                                                    z25 = true;
                                                }
                                            }
                                        }
                                    }
                                    g5Var6.v();
                                    if (z25) {
                                        g5Var6.q(0, iMin8);
                                    }
                                }
                                p3Var2.M2();
                                break;
                        }
                    }
                }, r10);
                b70VarA1.o();
                final b70 b70Var3 = b70VarA1;
                final int i56 = 0;
                i29 = 8;
                b70Var3.i(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i56) {
                            case 0:
                                b70Var3.f26984n0 = true;
                                boolean z24 = !model.f47588a.bordered;
                                g5 g5Var3 = g5Var2;
                                x5 x5Var = g5Var3.B;
                                if (x5Var != null) {
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var.f47588a;
                                    if (pageblocktable2.bordered != z24) {
                                        pageblocktable2.bordered = z24;
                                        g5Var3.v.invalidate();
                                        w2 w2Var = g5Var3.A;
                                        if (w2Var != null && g5Var3.f47594a != null) {
                                            w2Var.a();
                                        }
                                    }
                                }
                                f1VarArr[0].setChecked(z24);
                                break;
                            default:
                                b70Var3.f26984n0 = true;
                                boolean z25 = !model.f47588a.compact;
                                g5 g5Var4 = g5Var2;
                                x5 x5Var2 = g5Var4.B;
                                if (x5Var2 != null) {
                                    TL_iv.pageBlockTable pageblocktable3 = x5Var2.f47588a;
                                    if (pageblocktable3.compact != z25) {
                                        pageblocktable3.compact = z25;
                                        i5 i5Var = g5Var4.v;
                                        if (i5Var.f47198a != null) {
                                            for (int i57 = 0; i57 < i5Var.getChildCount(); i57++) {
                                                View childAt = i5Var.getChildAt(i57);
                                                if (childAt instanceof j5) {
                                                    ((j5) childAt).setCompact(i5Var.f47198a.f47588a.compact);
                                                }
                                            }
                                            i5Var.requestLayout();
                                            i5Var.invalidate();
                                        }
                                        g5Var4.f47166w.requestLayout();
                                        g5Var4.requestLayout();
                                        w2 w2Var2 = g5Var4.A;
                                        if (w2Var2 != null && g5Var4.f47594a != null) {
                                            w2Var2.a();
                                        }
                                    }
                                }
                                f1VarArr[1].setChecked(z25);
                                break;
                        }
                    }
                }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
                final int i57 = 1;
                g5Var2 = g5Var;
                b70Var3.i(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i57) {
                            case 0:
                                b70Var3.f26984n0 = true;
                                boolean z24 = !model.f47588a.bordered;
                                g5 g5Var3 = g5Var2;
                                x5 x5Var = g5Var3.B;
                                if (x5Var != null) {
                                    TL_iv.pageBlockTable pageblocktable2 = x5Var.f47588a;
                                    if (pageblocktable2.bordered != z24) {
                                        pageblocktable2.bordered = z24;
                                        g5Var3.v.invalidate();
                                        w2 w2Var = g5Var3.A;
                                        if (w2Var != null && g5Var3.f47594a != null) {
                                            w2Var.a();
                                        }
                                    }
                                }
                                f1VarArr[0].setChecked(z24);
                                break;
                            default:
                                b70Var3.f26984n0 = true;
                                boolean z25 = !model.f47588a.compact;
                                g5 g5Var4 = g5Var2;
                                x5 x5Var2 = g5Var4.B;
                                if (x5Var2 != null) {
                                    TL_iv.pageBlockTable pageblocktable3 = x5Var2.f47588a;
                                    if (pageblocktable3.compact != z25) {
                                        pageblocktable3.compact = z25;
                                        i5 i5Var = g5Var4.v;
                                        if (i5Var.f47198a != null) {
                                            for (int i58 = 0; i58 < i5Var.getChildCount(); i58++) {
                                                View childAt = i5Var.getChildAt(i58);
                                                if (childAt instanceof j5) {
                                                    ((j5) childAt).setCompact(i5Var.f47198a.f47588a.compact);
                                                }
                                            }
                                            i5Var.requestLayout();
                                            i5Var.invalidate();
                                        }
                                        g5Var4.f47166w.requestLayout();
                                        g5Var4.requestLayout();
                                        w2 w2Var2 = g5Var4.A;
                                        if (w2Var2 != null && g5Var4.f47594a != null) {
                                            w2Var2.a();
                                        }
                                    }
                                }
                                f1VarArr[1].setChecked(z25);
                                break;
                        }
                    }
                }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
                final org.telegram.ui.ActionBar.f1[] f1VarArr = {b70Var3.y(), b70Var3.y()};
                b70Var2 = b70Var3;
            } else {
                b70Var2 = b70VarA1;
                i29 = 8;
            }
            b70Var2.f26987p = new qf.a(this, b70Var2, g5Var2, i29);
            this.f47345f4 = b70Var2;
            b70Var2.Z();
        }
        c10 = 1;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 0;
        }
        if (z21) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z21) {
            z13 = false;
        } else {
            z13 = false;
        }
        b70Var = this.f47345f4;
        if (b70Var != null) {
            this.f47345f4 = null;
            b70Var.u();
        }
        int i410 = i10 + 1 + i11;
        if (z12) {
            i13 = 2;
        } else {
            i13 = 0;
        }
        int i411 = i410 + i13;
        if (z13) {
            i14 = 2;
        } else {
            i14 = 0;
        }
        int i412 = i411 + i14 + i12 + i39;
        if (zEquals) {
            i15 = 3;
        } else {
            i15 = 0;
        }
        int i413 = ((i412 + i15) * 48) + 68;
        i16 = i10;
        if (zEquals) {
            i17 = 8;
        } else {
            i17 = 0;
        }
        iDp = AndroidUtilities.dp(i413 + i17);
        frameLayoutP4 = P4(g5Var2, false);
        iArr = new int[2];
        frameLayoutP4.getLocationOnScreen(iArr);
        if ((iArr[c10] - iDp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            z15 = true;
        } else {
            z15 = true;
            frameLayoutP4 = P4(g5Var2, true);
        }
        b70VarA1 = this.f47340d3.A1(frameLayoutP4);
        b70VarA1.f26992s = 0;
        b70VarA1.f26993t = false;
        b70VarA1.Z = z15;
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setMinimumWidth(AndroidUtilities.dp(208.0f));
        linearLayout3.setOrientation(1);
        i18 = i12;
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.ArticleAlignment));
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(17);
        textView2.setTextColor(g6.v0(g6.f23423y6, this.f35277l2));
        linearLayout3.addView(textView2, z5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        i19 = i11;
        i20 = i39;
        linearLayout4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout4.setOrientation(0);
        linearLayout3.addView(linearLayout4, z5.q(-2, -2, 17));
        Context context2 = getContext();
        int i414 = R.drawable.iv_align_horiz_left;
        c6 c6Var2 = this.f47338c3;
        t1 t1Var9 = new t1(context2, i414, c6Var2);
        t1Var9.f47459e = 4;
        t1Var9.d();
        t1Var9.b();
        int i415 = g6.G8;
        t1Var9.c(i415);
        boolean z24 = z10;
        linearLayout4.addView(t1Var9, z5.n(32, 32));
        t1 t1Var10 = new t1(getContext(), R.drawable.iv_align_horiz_middle, c6Var2);
        t1Var10.f47459e = 4;
        t1Var10.d();
        t1Var10.b();
        t1Var10.c(i415);
        linearLayout4.addView(t1Var10, z5.n(32, 32));
        t1 t1Var11 = new t1(getContext(), R.drawable.iv_align_horiz_right, c6Var2);
        t1Var11.f47459e = 4;
        t1Var11.d();
        t1Var11.b();
        t1Var11.c(i415);
        t1VarArr = new t1[]{t1Var9, t1Var10, t1Var11};
        boolean z25 = z11;
        linearLayout4.addView(t1Var11, z5.n(32, 32));
        z16 = zEquals;
        linearLayout4.addView(new Space(getContext()), z5.n(8, 0));
        t1 t1Var12 = new t1(getContext(), R.drawable.iv_align_vert_top, c6Var2);
        t1Var12.f47459e = 4;
        t1Var12.d();
        t1Var12.b();
        t1Var12.c(i415);
        linearLayout4.addView(t1Var12, z5.n(32, 32));
        t1 t1Var13 = new t1(getContext(), R.drawable.iv_align_vert_middle, c6Var2);
        t1Var13.f47459e = 4;
        t1Var13.d();
        t1Var13.b();
        t1Var13.c(i415);
        linearLayout4.addView(t1Var13, z5.n(32, 32));
        t1 t1Var14 = new t1(getContext(), R.drawable.iv_align_vert_bottom, c6Var2);
        t1Var14.f47459e = 4;
        t1Var14.d();
        t1Var14.b();
        t1Var14.c(i415);
        t1VarArr2 = new t1[]{t1Var12, t1Var13, t1Var14};
        linearLayout4.addView(t1Var14, z5.n(32, 32));
        b70VarA1.q(linearLayout3);
        i21 = -1;
        while (r1.hasNext()) {
            if (pagetablecell2 != null) {
                i31 = 0;
            } else if (pagetablecell2.align_right) {
                i31 = 2;
            } else if (pagetablecell2.align_center) {
                i31 = 1;
            } else {
                i31 = 0;
            }
            if (i21 == -1) {
                if (i21 != i31) {
                    i21 = -1;
                    break;
                }
            } else {
                i21 = i31;
            }
        }
        i22 = -1;
        while (r1.hasNext()) {
            if (pagetablecell3 != null) {
                i30 = 0;
            } else if (pagetablecell3.valign_bottom) {
                i30 = 2;
            } else if (pagetablecell3.valign_middle) {
                i30 = 1;
            } else {
                i30 = 0;
            }
            if (i22 == -1) {
                if (i22 != i30) {
                    i22 = -1;
                    break;
                }
            } else {
                i22 = i30;
            }
        }
        while (i23 < 3) {
            t1 t1Var15 = t1VarArr[i23];
            if (i23 == i21) {
                z19 = true;
            } else {
                z19 = false;
            }
            t1Var15.setSelected(z19);
        }
        while (i25 < 3) {
            t1 t1Var16 = t1VarArr2[i25];
            if (i25 == i22) {
                z18 = true;
            } else {
                z18 = false;
            }
            t1Var16.setSelected(z18);
        }
        while (i26 < 3) {
            final int i416 = 0;
            t1VarArr[i26].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i416) {
                        case 0:
                            g5 g5Var3 = g5Var2;
                            i5 i5Var = g5Var3.v;
                            Iterator it8 = g5Var3.D.iterator();
                            while (true) {
                                boolean zHasNext = it8.hasNext();
                                int i417 = i26;
                                if (!zHasNext) {
                                    i5Var.invalidate();
                                    w2 w2Var = g5Var3.A;
                                    if (w2Var != null && g5Var3.f47594a != null) {
                                        w2Var.a();
                                    }
                                    int i418 = 0;
                                    while (i418 < 3) {
                                        t1VarArr[i418].setSelected(i418 == i417);
                                        i418++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it8.next();
                                    x5.k(pagetablecell4, i417);
                                    j5 j5VarM = i5Var.m(pagetablecell4);
                                    if (j5VarM != null && j5VarM.f47227b != null) {
                                        j5VarM.a();
                                        j5VarM.invalidate();
                                    }
                                }
                            }
                            break;
                        default:
                            g5 g5Var4 = g5Var2;
                            i5 i5Var2 = g5Var4.v;
                            Iterator it9 = g5Var4.D.iterator();
                            while (true) {
                                boolean zHasNext2 = it9.hasNext();
                                int i419 = i26;
                                if (!zHasNext2) {
                                    i5Var2.invalidate();
                                    w2 w2Var2 = g5Var4.A;
                                    if (w2Var2 != null && g5Var4.f47594a != null) {
                                        w2Var2.a();
                                    }
                                    int i58 = 0;
                                    while (i58 < 3) {
                                        t1VarArr[i58].setSelected(i58 == i419);
                                        i58++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it9.next();
                                    x5.m(pagetablecell5, i419);
                                    j5 j5VarM2 = i5Var2.m(pagetablecell5);
                                    if (j5VarM2 != null && j5VarM2.f47227b != null) {
                                        j5VarM2.a();
                                        j5VarM2.invalidate();
                                    }
                                }
                            }
                            break;
                    }
                }
            });
        }
        i27 = 0;
        while (i27 < i24) {
            final int i417 = 1;
            t1VarArr2[i27].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i417) {
                        case 0:
                            g5 g5Var3 = g5Var2;
                            i5 i5Var = g5Var3.v;
                            Iterator it8 = g5Var3.D.iterator();
                            while (true) {
                                boolean zHasNext = it8.hasNext();
                                int i418 = i27;
                                if (!zHasNext) {
                                    i5Var.invalidate();
                                    w2 w2Var = g5Var3.A;
                                    if (w2Var != null && g5Var3.f47594a != null) {
                                        w2Var.a();
                                    }
                                    int i419 = 0;
                                    while (i419 < 3) {
                                        t1VarArr2[i419].setSelected(i419 == i418);
                                        i419++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it8.next();
                                    x5.k(pagetablecell4, i418);
                                    j5 j5VarM = i5Var.m(pagetablecell4);
                                    if (j5VarM != null && j5VarM.f47227b != null) {
                                        j5VarM.a();
                                        j5VarM.invalidate();
                                    }
                                }
                            }
                            break;
                        default:
                            g5 g5Var4 = g5Var2;
                            i5 i5Var2 = g5Var4.v;
                            Iterator it9 = g5Var4.D.iterator();
                            while (true) {
                                boolean zHasNext2 = it9.hasNext();
                                int i4110 = i27;
                                if (!zHasNext2) {
                                    i5Var2.invalidate();
                                    w2 w2Var2 = g5Var4.A;
                                    if (w2Var2 != null && g5Var4.f47594a != null) {
                                        w2Var2.a();
                                    }
                                    int i58 = 0;
                                    while (i58 < 3) {
                                        t1VarArr2[i58].setSelected(i58 == i4110);
                                        i58++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it9.next();
                                    x5.m(pagetablecell5, i4110);
                                    j5 j5VarM2 = i5Var2.m(pagetablecell5);
                                    if (j5VarM2 != null && j5VarM2.f47227b != null) {
                                        j5VarM2.a();
                                        j5VarM2.invalidate();
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            i27++;
        }
        b70VarA1.o();
        b70VarA1.S = 208;
        if (linkedHashSet.isEmpty()) {
            z17 = false;
            break;
        }
        it = linkedHashSet.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((TL_iv.pageTableCell) it.next()).header) {
                    z17 = false;
                    break;
                }
            } else {
                z17 = true;
                break;
            }
        }
        if (z17) {
            string = LocaleController.getString(R.string.ArticleRemoveHighlight);
        } else if (z16) {
            string = LocaleController.getString(R.string.ArticleHighlightCells);
        } else {
            string = LocaleController.getString(R.string.ArticleHighlightCells);
        }
        if (z17) {
            i28 = R.drawable.iv_table_highlight_remove;
        } else {
            i28 = R.drawable.iv_table_highlight;
        }
        b70VarA1.c(i28, string, new op0(this, g5Var2, z17, 13), false);
        if (i16 != 0) {
            final int i418 = 2;
            b70VarA1.c(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i418) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i419 = 0;
                                            for (int i58 = 0; i58 < x5Var.f47589b; i58++) {
                                                iArr2[i58] = i419;
                                                if (!zArr[i58]) {
                                                    i419++;
                                                }
                                            }
                                            if (i419 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i59 = 0;
                                                while (i59 < size2) {
                                                    Object obj = arrayList.get(i59);
                                                    i59++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i510 = pagetablecell4.colspan;
                                                    if (i510 == 0) {
                                                        i510 = 1;
                                                    }
                                                    int i511 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i512 = 0;
                                                    for (int i513 = iB5; i513 < iB5 + iO2 && i513 < x5Var.f47589b; i513++) {
                                                        if (!zArr[i513]) {
                                                            if (i511 < 0) {
                                                                i511 = i513;
                                                            }
                                                            i512++;
                                                        }
                                                    }
                                                    if (i511 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i511], iA3, i512, i510});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i419);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i514 = pagetablecell6.colspan;
                                        if (i514 == 0) {
                                            i514 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i514) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i515 = iMin4;
                                    while (true) {
                                        if (i515 <= iMax3) {
                                            int i516 = iMin7;
                                            while (true) {
                                                if (i516 > iMax4) {
                                                    i515++;
                                                } else if (i515 >= 0 && i516 >= 0 && i515 < x5Var2.f47589b && i516 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i515][i516]);
                                                    i516++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i517 = 0;
                                            while (i517 < size3) {
                                                Object obj2 = arrayList2.get(i517);
                                                i517++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, false);
        }
        if (i19 != 0) {
            final int i419 = 3;
            b70VarA1.c(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i419) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i58 = 0; i58 < x5Var.f47589b; i58++) {
                                                iArr2[i58] = i4110;
                                                if (!zArr[i58]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i59 = 0;
                                                while (i59 < size2) {
                                                    Object obj = arrayList.get(i59);
                                                    i59++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i510 = pagetablecell4.colspan;
                                                    if (i510 == 0) {
                                                        i510 = 1;
                                                    }
                                                    int i511 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i512 = 0;
                                                    for (int i513 = iB5; i513 < iB5 + iO2 && i513 < x5Var.f47589b; i513++) {
                                                        if (!zArr[i513]) {
                                                            if (i511 < 0) {
                                                                i511 = i513;
                                                            }
                                                            i512++;
                                                        }
                                                    }
                                                    if (i511 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i511], iA3, i512, i510});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i514 = pagetablecell6.colspan;
                                        if (i514 == 0) {
                                            i514 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i514) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i515 = iMin4;
                                    while (true) {
                                        if (i515 <= iMax3) {
                                            int i516 = iMin7;
                                            while (true) {
                                                if (i516 > iMax4) {
                                                    i515++;
                                                } else if (i515 >= 0 && i516 >= 0 && i515 < x5Var2.f47589b && i516 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i515][i516]);
                                                    i516++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i517 = 0;
                                            while (i517 < size3) {
                                                Object obj2 = arrayList2.get(i517);
                                                i517++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, false);
        }
        if (z12) {
            final int i58 = 4;
            b70VarA1.c(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i58) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i59 = 0; i59 < x5Var.f47589b; i59++) {
                                                iArr2[i59] = i4110;
                                                if (!zArr[i59]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i510 = 0;
                                                while (i510 < size2) {
                                                    Object obj = arrayList.get(i510);
                                                    i510++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i511 = pagetablecell4.colspan;
                                                    if (i511 == 0) {
                                                        i511 = 1;
                                                    }
                                                    int i512 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i513 = 0;
                                                    for (int i514 = iB5; i514 < iB5 + iO2 && i514 < x5Var.f47589b; i514++) {
                                                        if (!zArr[i514]) {
                                                            if (i512 < 0) {
                                                                i512 = i514;
                                                            }
                                                            i513++;
                                                        }
                                                    }
                                                    if (i512 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i512], iA3, i513, i511});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i515 = pagetablecell6.colspan;
                                        if (i515 == 0) {
                                            i515 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i515) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i516 = iMin4;
                                    while (true) {
                                        if (i516 <= iMax3) {
                                            int i517 = iMin7;
                                            while (true) {
                                                if (i517 > iMax4) {
                                                    i516++;
                                                } else if (i516 >= 0 && i517 >= 0 && i516 < x5Var2.f47589b && i517 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i516][i517]);
                                                    i517++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i518 = 0;
                                            while (i518 < size3) {
                                                Object obj2 = arrayList2.get(i518);
                                                i518++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, false);
            final int i59 = 5;
            b70VarA1.c(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i59) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i510 = 0; i510 < x5Var.f47589b; i510++) {
                                                iArr2[i510] = i4110;
                                                if (!zArr[i510]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i511 = 0;
                                                while (i511 < size2) {
                                                    Object obj = arrayList.get(i511);
                                                    i511++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i512 = pagetablecell4.colspan;
                                                    if (i512 == 0) {
                                                        i512 = 1;
                                                    }
                                                    int i513 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i514 = 0;
                                                    for (int i515 = iB5; i515 < iB5 + iO2 && i515 < x5Var.f47589b; i515++) {
                                                        if (!zArr[i515]) {
                                                            if (i513 < 0) {
                                                                i513 = i515;
                                                            }
                                                            i514++;
                                                        }
                                                    }
                                                    if (i513 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i513], iA3, i514, i512});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i516 = pagetablecell6.colspan;
                                        if (i516 == 0) {
                                            i516 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i516) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i517 = iMin4;
                                    while (true) {
                                        if (i517 <= iMax3) {
                                            int i518 = iMin7;
                                            while (true) {
                                                if (i518 > iMax4) {
                                                    i517++;
                                                } else if (i517 >= 0 && i518 >= 0 && i517 < x5Var2.f47589b && i518 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i517][i518]);
                                                    i518++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i519 = 0;
                                            while (i519 < size3) {
                                                Object obj2 = arrayList2.get(i519);
                                                i519++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, false);
        }
        if (z13) {
            final int i510 = 6;
            b70VarA1.c(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i510) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i511 = 0; i511 < x5Var.f47589b; i511++) {
                                                iArr2[i511] = i4110;
                                                if (!zArr[i511]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i512 = 0;
                                                while (i512 < size2) {
                                                    Object obj = arrayList.get(i512);
                                                    i512++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i513 = pagetablecell4.colspan;
                                                    if (i513 == 0) {
                                                        i513 = 1;
                                                    }
                                                    int i514 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i515 = 0;
                                                    for (int i516 = iB5; i516 < iB5 + iO2 && i516 < x5Var.f47589b; i516++) {
                                                        if (!zArr[i516]) {
                                                            if (i514 < 0) {
                                                                i514 = i516;
                                                            }
                                                            i515++;
                                                        }
                                                    }
                                                    if (i514 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i514], iA3, i515, i513});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i517 = pagetablecell6.colspan;
                                        if (i517 == 0) {
                                            i517 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i517) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i518 = iMin4;
                                    while (true) {
                                        if (i518 <= iMax3) {
                                            int i519 = iMin7;
                                            while (true) {
                                                if (i519 > iMax4) {
                                                    i518++;
                                                } else if (i518 >= 0 && i519 >= 0 && i518 < x5Var2.f47589b && i519 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i518][i519]);
                                                    i519++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i5110 = 0;
                                            while (i5110 < size3) {
                                                Object obj2 = arrayList2.get(i5110);
                                                i5110++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, false);
            final int i511 = 7;
            b70VarA1.c(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i511) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i512 = 0; i512 < x5Var.f47589b; i512++) {
                                                iArr2[i512] = i4110;
                                                if (!zArr[i512]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i513 = 0;
                                                while (i513 < size2) {
                                                    Object obj = arrayList.get(i513);
                                                    i513++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i514 = pagetablecell4.colspan;
                                                    if (i514 == 0) {
                                                        i514 = 1;
                                                    }
                                                    int i515 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i516 = 0;
                                                    for (int i517 = iB5; i517 < iB5 + iO2 && i517 < x5Var.f47589b; i517++) {
                                                        if (!zArr[i517]) {
                                                            if (i515 < 0) {
                                                                i515 = i517;
                                                            }
                                                            i516++;
                                                        }
                                                    }
                                                    if (i515 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i515], iA3, i516, i514});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i518 = pagetablecell6.colspan;
                                        if (i518 == 0) {
                                            i518 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i518) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i519 = iMin4;
                                    while (true) {
                                        if (i519 <= iMax3) {
                                            int i5110 = iMin7;
                                            while (true) {
                                                if (i5110 > iMax4) {
                                                    i519++;
                                                } else if (i519 >= 0 && i5110 >= 0 && i519 < x5Var2.f47589b && i5110 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i519][i5110]);
                                                    i5110++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i5111 = 0;
                                            while (i5111 < size3) {
                                                Object obj2 = arrayList2.get(i5111);
                                                i5111++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, false);
        }
        if (i18 != 0) {
            final int i512 = 8;
            r10 = 1;
            b70VarA1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i512) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i513 = 0; i513 < x5Var.f47589b; i513++) {
                                                iArr2[i513] = i4110;
                                                if (!zArr[i513]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i514 = 0;
                                                while (i514 < size2) {
                                                    Object obj = arrayList.get(i514);
                                                    i514++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i515 = pagetablecell4.colspan;
                                                    if (i515 == 0) {
                                                        i515 = 1;
                                                    }
                                                    int i516 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i517 = 0;
                                                    for (int i518 = iB5; i518 < iB5 + iO2 && i518 < x5Var.f47589b; i518++) {
                                                        if (!zArr[i518]) {
                                                            if (i516 < 0) {
                                                                i516 = i518;
                                                            }
                                                            i517++;
                                                        }
                                                    }
                                                    if (i516 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i516], iA3, i517, i515});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i519 = pagetablecell6.colspan;
                                        if (i519 == 0) {
                                            i519 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i519) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i5110 = iMin4;
                                    while (true) {
                                        if (i5110 <= iMax3) {
                                            int i5111 = iMin7;
                                            while (true) {
                                                if (i5111 > iMax4) {
                                                    i5110++;
                                                } else if (i5110 >= 0 && i5111 >= 0 && i5110 < x5Var2.f47589b && i5111 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i5110][i5111]);
                                                    i5111++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i5112 = 0;
                                            while (i5112 < size3) {
                                                Object obj2 = arrayList2.get(i5112);
                                                i5112++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, true);
        } else {
            r10 = 1;
        }
        if (i20 != 0) {
            final int i513 = 0;
            b70VarA1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (i513) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i514 = 0; i514 < x5Var.f47589b; i514++) {
                                                iArr2[i514] = i4110;
                                                if (!zArr[i514]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i515 = 0;
                                                while (i515 < size2) {
                                                    Object obj = arrayList.get(i515);
                                                    i515++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i516 = pagetablecell4.colspan;
                                                    if (i516 == 0) {
                                                        i516 = 1;
                                                    }
                                                    int i517 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i518 = 0;
                                                    for (int i519 = iB5; i519 < iB5 + iO2 && i519 < x5Var.f47589b; i519++) {
                                                        if (!zArr[i519]) {
                                                            if (i517 < 0) {
                                                                i517 = i519;
                                                            }
                                                            i518++;
                                                        }
                                                    }
                                                    if (i517 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i517], iA3, i518, i516});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i5110 = pagetablecell6.colspan;
                                        if (i5110 == 0) {
                                            i5110 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i5110) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i5111 = iMin4;
                                    while (true) {
                                        if (i5111 <= iMax3) {
                                            int i5112 = iMin7;
                                            while (true) {
                                                if (i5112 > iMax4) {
                                                    i5111++;
                                                } else if (i5111 >= 0 && i5112 >= 0 && i5111 < x5Var2.f47589b && i5112 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i5111][i5112]);
                                                    i5112++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i5113 = 0;
                                            while (i5113 < size3) {
                                                Object obj2 = arrayList2.get(i5113);
                                                i5113++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, r10);
        }
        if (z16) {
            b70VarA1.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) {

                public final p3 f47151b;

                {
                    this.f47151b = this;
                }

                @Override
                public final void run() {
                    p3 p3Var;
                    boolean z26;
                    int iB2;
                    int iB3;
                    int iA2;
                    p3 p3Var2;
                    boolean z27;
                    switch (r10) {
                        case 0:
                            p3 p3Var3 = this.f47151b;
                            p3Var3.getClass();
                            g5 g5Var3 = g5Var2;
                            LinkedHashSet linkedHashSet2 = g5Var3.D;
                            if (g5Var3.B == null || linkedHashSet2.isEmpty()) {
                                p3Var = p3Var3;
                            } else {
                                HashSet hashSet7 = new HashSet();
                                Iterator it8 = linkedHashSet2.iterator();
                                int iMin3 = Integer.MAX_VALUE;
                                while (it8.hasNext()) {
                                    int iB4 = g5Var3.B.b((TL_iv.pageTableCell) it8.next());
                                    hashSet7.add(Integer.valueOf(iB4));
                                    iMin3 = Math.min(iMin3, iB4);
                                }
                                linkedHashSet2.clear();
                                x5 x5Var = g5Var3.B;
                                x5Var.getClass();
                                if (hashSet7.isEmpty()) {
                                    p3Var = p3Var3;
                                    z26 = false;
                                } else {
                                    boolean[] zArr = new boolean[x5Var.f47589b];
                                    Iterator it9 = hashSet7.iterator();
                                    while (true) {
                                        z26 = true;
                                        if (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < x5Var.f47589b) {
                                                zArr[iIntValue3] = true;
                                            }
                                        } else {
                                            int[] iArr2 = new int[x5Var.f47589b];
                                            int i4110 = 0;
                                            for (int i514 = 0; i514 < x5Var.f47589b; i514++) {
                                                iArr2[i514] = i4110;
                                                if (!zArr[i514]) {
                                                    i4110++;
                                                }
                                            }
                                            if (i4110 == 0) {
                                                x5Var.f47588a.rows.clear();
                                                x5Var.i();
                                                p3Var = p3Var3;
                                            } else {
                                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                                ArrayList arrayList = x5Var.f47593g;
                                                int size2 = arrayList.size();
                                                int i515 = 0;
                                                while (i515 < size2) {
                                                    Object obj = arrayList.get(i515);
                                                    i515++;
                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                    int iB5 = x5Var.b(pagetablecell4);
                                                    int iA3 = x5Var.a(pagetablecell4);
                                                    int iO2 = x5.o(pagetablecell4);
                                                    int i516 = pagetablecell4.colspan;
                                                    if (i516 == 0) {
                                                        i516 = 1;
                                                    }
                                                    int i517 = -1;
                                                    p3 p3Var4 = p3Var3;
                                                    int[] iArr3 = iArr2;
                                                    int i518 = 0;
                                                    for (int i519 = iB5; i519 < iB5 + iO2 && i519 < x5Var.f47589b; i519++) {
                                                        if (!zArr[i519]) {
                                                            if (i517 < 0) {
                                                                i517 = i519;
                                                            }
                                                            i518++;
                                                        }
                                                    }
                                                    if (i517 >= 0) {
                                                        identityHashMap.put(pagetablecell4, new int[]{iArr3[i517], iA3, i518, i516});
                                                    }
                                                    p3Var3 = p3Var4;
                                                    iArr2 = iArr3;
                                                }
                                                p3Var = p3Var3;
                                                x5Var.j(identityHashMap, i4110);
                                                x5Var.i();
                                                z26 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var3.v();
                                if (z26) {
                                    g5Var3.q(iMin3, 0);
                                }
                            }
                            p3Var.M2();
                            break;
                        case 1:
                            p3 p3Var5 = this.f47151b;
                            p3Var5.getClass();
                            a row = g5Var2.getRow();
                            p3Var5.M2();
                            if (row != null) {
                                b2 b2Var = p3Var5.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var5.r4(row);
                                b2 b2Var2 = p3Var5.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                n3 n3Var = p3Var5.f47340d3;
                                if (n3Var != null) {
                                    n3Var.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            g5 g5Var4 = g5Var2;
                            LinkedHashSet linkedHashSet3 = g5Var4.D;
                            if (g5Var4.B != null && linkedHashSet3.size() >= 2) {
                                HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                int iMin4 = Integer.MAX_VALUE;
                                int iMin5 = Integer.MAX_VALUE;
                                int iMin6 = Integer.MAX_VALUE;
                                for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                    iMin5 = Math.min(iMin5, g5Var4.B.b(pagetablecell5));
                                    iMin6 = Math.min(iMin6, g5Var4.B.a(pagetablecell5));
                                }
                                linkedHashSet3.clear();
                                x5 x5Var2 = g5Var4.B;
                                TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
                                if (hashSet8.size() < 2) {
                                    linkedHashSet3.addAll(hashSet8);
                                } else {
                                    int iMin7 = Integer.MAX_VALUE;
                                    int iMax3 = -1;
                                    int iMax4 = -1;
                                    for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                        int iB6 = x5Var2.b(pagetablecell6);
                                        int iA4 = x5Var2.a(pagetablecell6);
                                        int iO3 = x5.o(pagetablecell6);
                                        int i5110 = pagetablecell6.colspan;
                                        if (i5110 == 0) {
                                            i5110 = 1;
                                        }
                                        iMin4 = Math.min(iMin4, iB6);
                                        iMin7 = Math.min(iMin7, iA4);
                                        iMax3 = Math.max(iMax3, (iB6 + iO3) - 1);
                                        iMax4 = Math.max(iMax4, (iA4 + i5110) - 1);
                                    }
                                    HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                    int i5111 = iMin4;
                                    while (true) {
                                        if (i5111 <= iMax3) {
                                            int i5112 = iMin7;
                                            while (true) {
                                                if (i5112 > iMax4) {
                                                    i5111++;
                                                } else if (i5111 >= 0 && i5112 >= 0 && i5111 < x5Var2.f47589b && i5112 < x5Var2.f47590c) {
                                                    hashSet9.add(x5Var2.d[i5111][i5112]);
                                                    i5112++;
                                                }
                                            }
                                        } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                            StringBuilder sb2 = new StringBuilder();
                                            ArrayList arrayList2 = new ArrayList(hashSet9);
                                            Collections.sort(arrayList2, new ag.h(x5Var2, 5));
                                            int size3 = arrayList2.size();
                                            int i5113 = 0;
                                            while (i5113 < size3) {
                                                Object obj2 = arrayList2.get(i5113);
                                                i5113++;
                                                String strG = x5.g((TL_iv.pageTableCell) obj2);
                                                if (strG.isEmpty()) {
                                                    arrayList2 = arrayList2;
                                                } else {
                                                    if (sb2.length() > 0) {
                                                        sb2.append("\n");
                                                    }
                                                    sb2.append(strG);
                                                }
                                                arrayList2 = arrayList2;
                                            }
                                            TL_iv.pageTableCell pagetablecell7 = x5Var2.d[iMin4][iMin7];
                                            int i60 = (iMax4 - iMin7) + 1;
                                            int i61 = (iMax3 - iMin4) + 1;
                                            if (i60 <= 1) {
                                                i60 = 0;
                                            }
                                            pagetablecell7.colspan = i60;
                                            int i62 = i61 > 1 ? i61 : 0;
                                            pagetablecell7.rowspan = i62;
                                            int i63 = pagetablecell7.flags;
                                            pagetablecell7.flags = i60 > 0 ? i63 | 2 : i63 & (-3);
                                            int i64 = pagetablecell7.flags;
                                            pagetablecell7.flags = i62 > 0 ? i64 | 4 : i64 & (-5);
                                            x5.c(pagetablecell7, sb2.toString());
                                            for (TL_iv.pageTableCell pagetablecell8 : hashSet9) {
                                                if (pagetablecell8 != pagetablecell7 && (iB2 = x5Var2.b(pagetablecell8)) >= 0 && iB2 < pageblocktable2.rows.size()) {
                                                    pageblocktable2.rows.get(iB2).cells.remove(pagetablecell8);
                                                }
                                            }
                                            x5Var2.i();
                                            g5Var4.v();
                                            g5Var4.v.invalidate();
                                            g5Var4.q(iMin5, iMin6);
                                            g5Var4.t();
                                        }
                                    }
                                    linkedHashSet3.addAll(hashSet8);
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 3:
                            g5 g5Var5 = g5Var2;
                            LinkedHashSet linkedHashSet4 = g5Var5.D;
                            if (g5Var5.B != null && linkedHashSet4.size() == 1) {
                                TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                if (x5.n(pagetablecell9) > 1) {
                                    iB3 = g5Var5.B.b(pagetablecell9);
                                    iA2 = g5Var5.B.a(pagetablecell9);
                                    linkedHashSet4.clear();
                                    if (g5Var5.B.p(pagetablecell9)) {
                                        g5Var5.v();
                                        g5Var5.v.invalidate();
                                        g5Var5.q(iB3, iA2);
                                        g5Var5.t();
                                    } else {
                                        linkedHashSet4.add(pagetablecell9);
                                    }
                                } else {
                                    int i65 = pagetablecell9.rowspan;
                                    if (i65 == 0) {
                                        i65 = 1;
                                    }
                                    if (i65 > 1) {
                                        iB3 = g5Var5.B.b(pagetablecell9);
                                        iA2 = g5Var5.B.a(pagetablecell9);
                                        linkedHashSet4.clear();
                                        if (g5Var5.B.p(pagetablecell9)) {
                                            g5Var5.v();
                                            g5Var5.v.invalidate();
                                            g5Var5.q(iB3, iA2);
                                            g5Var5.t();
                                        } else {
                                            linkedHashSet4.add(pagetablecell9);
                                        }
                                    }
                                }
                            }
                            this.f47151b.M2();
                            break;
                        case 4:
                            g5Var2.i(true);
                            this.f47151b.M2();
                            break;
                        case 5:
                            g5Var2.i(false);
                            this.f47151b.M2();
                            break;
                        case 6:
                            g5Var2.j(true);
                            this.f47151b.M2();
                            break;
                        case 7:
                            g5Var2.j(false);
                            this.f47151b.M2();
                            break;
                        default:
                            p3 p3Var6 = this.f47151b;
                            p3Var6.getClass();
                            g5 g5Var6 = g5Var2;
                            LinkedHashSet linkedHashSet5 = g5Var6.D;
                            if (g5Var6.B == null || linkedHashSet5.isEmpty()) {
                                p3Var2 = p3Var6;
                            } else {
                                HashSet hashSet10 = new HashSet();
                                Iterator it10 = linkedHashSet5.iterator();
                                int iMin8 = Integer.MAX_VALUE;
                                while (it10.hasNext()) {
                                    int iA5 = g5Var6.B.a((TL_iv.pageTableCell) it10.next());
                                    hashSet10.add(Integer.valueOf(iA5));
                                    iMin8 = Math.min(iMin8, iA5);
                                }
                                linkedHashSet5.clear();
                                x5 x5Var3 = g5Var6.B;
                                x5Var3.getClass();
                                if (hashSet10.isEmpty()) {
                                    p3Var2 = p3Var6;
                                    z27 = false;
                                } else {
                                    boolean[] zArr2 = new boolean[x5Var3.f47590c];
                                    Iterator it11 = hashSet10.iterator();
                                    while (true) {
                                        z27 = true;
                                        if (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < x5Var3.f47590c) {
                                                zArr2[iIntValue4] = true;
                                            }
                                        } else {
                                            int[] iArr4 = new int[x5Var3.f47590c];
                                            int i66 = 0;
                                            for (int i67 = 0; i67 < x5Var3.f47590c; i67++) {
                                                iArr4[i67] = i66;
                                                if (!zArr2[i67]) {
                                                    i66++;
                                                }
                                            }
                                            if (i66 == 0) {
                                                x5Var3.f47588a.rows.clear();
                                                x5Var3.i();
                                                p3Var2 = p3Var6;
                                            } else {
                                                IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                ArrayList arrayList3 = x5Var3.f47593g;
                                                int size4 = arrayList3.size();
                                                int i68 = 0;
                                                while (i68 < size4) {
                                                    Object obj3 = arrayList3.get(i68);
                                                    i68++;
                                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                    int iB7 = x5Var3.b(pagetablecell10);
                                                    int iA6 = x5Var3.a(pagetablecell10);
                                                    int iO4 = x5.o(pagetablecell10);
                                                    int i69 = pagetablecell10.colspan;
                                                    if (i69 == 0) {
                                                        i69 = 1;
                                                    }
                                                    int i70 = -1;
                                                    p3 p3Var7 = p3Var6;
                                                    int[] iArr5 = iArr4;
                                                    boolean[] zArr3 = zArr2;
                                                    int i71 = 0;
                                                    for (int i72 = iA6; i72 < iA6 + i69 && i72 < x5Var3.f47590c; i72++) {
                                                        if (!zArr3[i72]) {
                                                            if (i70 < 0) {
                                                                i70 = i72;
                                                            }
                                                            i71++;
                                                        }
                                                    }
                                                    if (i70 >= 0) {
                                                        identityHashMap2.put(pagetablecell10, new int[]{iB7, iArr5[i70], iO4, i71});
                                                    }
                                                    p3Var6 = p3Var7;
                                                    iArr4 = iArr5;
                                                    zArr2 = zArr3;
                                                }
                                                p3Var2 = p3Var6;
                                                x5Var3.j(identityHashMap2, x5Var3.f47589b);
                                                x5Var3.i();
                                                z27 = true;
                                            }
                                        }
                                    }
                                }
                                g5Var6.v();
                                if (z27) {
                                    g5Var6.q(0, iMin8);
                                }
                            }
                            p3Var2.M2();
                            break;
                    }
                }
            }, r10);
            b70VarA1.o();
            final b70 b70Var4 = b70VarA1;
            final int i514 = 0;
            i29 = 8;
            b70Var4.i(new Runnable() {
                @Override
                public final void run() {
                    switch (i514) {
                        case 0:
                            b70Var4.f26984n0 = true;
                            boolean z26 = !model.f47588a.bordered;
                            g5 g5Var3 = g5Var2;
                            x5 x5Var = g5Var3.B;
                            if (x5Var != null) {
                                TL_iv.pageBlockTable pageblocktable2 = x5Var.f47588a;
                                if (pageblocktable2.bordered != z26) {
                                    pageblocktable2.bordered = z26;
                                    g5Var3.v.invalidate();
                                    w2 w2Var = g5Var3.A;
                                    if (w2Var != null && g5Var3.f47594a != null) {
                                        w2Var.a();
                                    }
                                }
                            }
                            f1VarArr[0].setChecked(z26);
                            break;
                        default:
                            b70Var4.f26984n0 = true;
                            boolean z27 = !model.f47588a.compact;
                            g5 g5Var4 = g5Var2;
                            x5 x5Var2 = g5Var4.B;
                            if (x5Var2 != null) {
                                TL_iv.pageBlockTable pageblocktable3 = x5Var2.f47588a;
                                if (pageblocktable3.compact != z27) {
                                    pageblocktable3.compact = z27;
                                    i5 i5Var = g5Var4.v;
                                    if (i5Var.f47198a != null) {
                                        for (int i515 = 0; i515 < i5Var.getChildCount(); i515++) {
                                            View childAt = i5Var.getChildAt(i515);
                                            if (childAt instanceof j5) {
                                                ((j5) childAt).setCompact(i5Var.f47198a.f47588a.compact);
                                            }
                                        }
                                        i5Var.requestLayout();
                                        i5Var.invalidate();
                                    }
                                    g5Var4.f47166w.requestLayout();
                                    g5Var4.requestLayout();
                                    w2 w2Var2 = g5Var4.A;
                                    if (w2Var2 != null && g5Var4.f47594a != null) {
                                        w2Var2.a();
                                    }
                                }
                            }
                            f1VarArr[1].setChecked(z27);
                            break;
                    }
                }
            }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
            final int i515 = 1;
            g5Var2 = g5Var;
            b70Var4.i(new Runnable() {
                @Override
                public final void run() {
                    switch (i515) {
                        case 0:
                            b70Var4.f26984n0 = true;
                            boolean z26 = !model.f47588a.bordered;
                            g5 g5Var3 = g5Var2;
                            x5 x5Var = g5Var3.B;
                            if (x5Var != null) {
                                TL_iv.pageBlockTable pageblocktable2 = x5Var.f47588a;
                                if (pageblocktable2.bordered != z26) {
                                    pageblocktable2.bordered = z26;
                                    g5Var3.v.invalidate();
                                    w2 w2Var = g5Var3.A;
                                    if (w2Var != null && g5Var3.f47594a != null) {
                                        w2Var.a();
                                    }
                                }
                            }
                            f1VarArr[0].setChecked(z26);
                            break;
                        default:
                            b70Var4.f26984n0 = true;
                            boolean z27 = !model.f47588a.compact;
                            g5 g5Var4 = g5Var2;
                            x5 x5Var2 = g5Var4.B;
                            if (x5Var2 != null) {
                                TL_iv.pageBlockTable pageblocktable3 = x5Var2.f47588a;
                                if (pageblocktable3.compact != z27) {
                                    pageblocktable3.compact = z27;
                                    i5 i5Var = g5Var4.v;
                                    if (i5Var.f47198a != null) {
                                        for (int i516 = 0; i516 < i5Var.getChildCount(); i516++) {
                                            View childAt = i5Var.getChildAt(i516);
                                            if (childAt instanceof j5) {
                                                ((j5) childAt).setCompact(i5Var.f47198a.f47588a.compact);
                                            }
                                        }
                                        i5Var.requestLayout();
                                        i5Var.invalidate();
                                    }
                                    g5Var4.f47166w.requestLayout();
                                    g5Var4.requestLayout();
                                    w2 w2Var2 = g5Var4.A;
                                    if (w2Var2 != null && g5Var4.f47594a != null) {
                                        w2Var2.a();
                                    }
                                }
                            }
                            f1VarArr[1].setChecked(z27);
                            break;
                    }
                }
            }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
            final org.telegram.ui.ActionBar.f1[] f1VarArr2 = {b70Var4.y(), b70Var4.y()};
            b70Var2 = b70Var4;
        } else {
            b70Var2 = b70VarA1;
            i29 = 8;
        }
        b70Var2.f26987p = new qf.a(this, b70Var2, g5Var2, i29);
        this.f47345f4 = b70Var2;
        b70Var2.Z();
    }

    @Override
    public final void G1(f2.o1 o1Var) {
        int iB;
        n41 n41VarG;
        a aVar = null;
        if (o1Var != null && (iB = o1Var.b()) >= 0 && (n41VarG = this.U2.G(iB)) != null) {
            Object obj = n41VarG.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.O3 = aVar;
        this.P3 = false;
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.D0();
        }
    }

    public final void G2() {
        d3 d3Var = this.f47352j3;
        if (d3Var != null) {
            d3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.V3;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((s4) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.W3;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((o4) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i10;
        a aVarY4;
        d3 d3Var = this.f47352j3;
        return d3Var != null && d3Var.y() && (i10 = d3Var.f24540u0) == d3Var.f24543x0 && i10 >= 0 && i10 < this.f47357l4.size() && d3Var.f24541v0 == 1 && d3Var.f24544y0 == 1 && (aVarY4 = y4(i10)) != null && t5.p(aVarY4.f47028b);
    }

    public final t5 G4() {
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y()) {
            return null;
        }
        int i10 = d3Var.f24540u0;
        int i11 = d3Var.f24543x0;
        a aVarY4 = y4(i10);
        if (i10 == i11 && aVarY4 != null && A3(aVarY4.f47028b)) {
            return u2(i10);
        }
        return null;
    }

    public final int H2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f47348h3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f47033i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean H3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f47348h3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f47033i && !x3(aVar)) {
                        if (!aVar.f47035k.isEmpty() || t5.p(aVar.f47028b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable H4(int i10, int i11, int i12, int i13) {
        if (i10 != i12) {
            return null;
        }
        if (x3(y4(i10))) {
            d1 d1VarI2 = I2(i10);
            if (d1VarI2 != null) {
                return d1VarI2.getText();
            }
            return null;
        }
        if (G3()) {
            d1 d1VarJ4 = j4(i10);
            if (d1VarJ4 != null) {
                return d1VarJ4.getText();
            }
            return null;
        }
        a aVarY4 = y4(i10);
        if (aVarY4 == null || !A3(aVarY4.f47028b)) {
            return null;
        }
        int iI2 = i2(i10);
        if (pa.y(i11, i13, iI2, 0) >= pa.d(i11, i13, iI2, 0)) {
            return null;
        }
        t5 t5VarU2 = u2(i10);
        return t5VarU2 != null ? t5VarU2.getEditText().getText() : t5.A(aVarY4.f47028b);
    }

    public final d1 I2(int i10) {
        if (!x3(y4(i10))) {
            return null;
        }
        View viewA4 = A4(i10);
        if (viewA4 instanceof q0) {
            return ((q0) viewA4).getEditText();
        }
        return null;
    }

    public final boolean I3() {
        d3 d3Var = this.f47352j3;
        if (d3Var != null && d3Var.y()) {
            int i10 = d3Var.f24540u0;
            int i11 = d3Var.f24543x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVarY4 = y4(i10);
                    if (aVarY4 != null) {
                        if (C3(aVarY4.f47028b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean I4(int i10, int i11, int i12, int i13, ArrayList arrayList) {
        int i14;
        a aVar;
        a aVar2;
        CharSequence charSequenceA;
        CharSequence charSequenceA2;
        CharSequence charSequenceSubSequence;
        CharSequence charSequenceSubSequence2;
        b2 b2Var;
        ArrayList arrayList2;
        TL_iv.PageBlock pageBlock;
        SpannableStringBuilder spannableStringBuilderA;
        int length;
        int i15;
        b2 b2Var2;
        a aVar3;
        if (i10 >= 0 && i11 >= 0) {
            ArrayList arrayList3 = this.f47348h3;
            if (i10 < arrayList3.size() && i11 < arrayList3.size()) {
                if (i10 <= i11) {
                    if (i10 == i11 && i12 > i13) {
                    }
                    for (i14 = i10; i14 <= i11; i14++) {
                        aVar3 = (a) arrayList3.get(i14);
                        if (aVar3.f47033i && !x3(aVar3) && !E3(aVar3.f47028b) && !l3(aVar3.f47028b) && !(aVar3.f47028b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i10);
                    aVar2 = (a) arrayList3.get(i11);
                    charSequenceA = t5.A(aVar.f47028b);
                    if (i10 == i11) {
                        charSequenceA2 = charSequenceA;
                    } else {
                        charSequenceA2 = t5.A(aVar2.f47028b);
                    }
                    if (charSequenceA == null) {
                        charSequenceA = "";
                    }
                    if (charSequenceA2 == null) {
                        charSequenceA2 = "";
                    }
                    int iMax = Math.max(0, Math.min(i12, charSequenceA.length()));
                    int iMax2 = Math.max(0, Math.min(i13, charSequenceA2.length()));
                    charSequenceSubSequence = charSequenceA.subSequence(0, iMax);
                    charSequenceSubSequence2 = charSequenceA2.subSequence(iMax2, charSequenceA2.length());
                    b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (arrayList.size() == 1 || !F3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (charSequenceSubSequence.length() > 0) {
                            TL_iv.PageBlock pageBlockS3 = S3(aVar.f47028b);
                            t5.e(pageBlockS3, charSequenceSubSequence);
                            arrayList2.add(0, new a(pageBlockS3, aVar.f47029c, aVar.d));
                        }
                        aVar = (a) i0.a.i(1, arrayList);
                        if (aVar == null) {
                            length = 0;
                        } else if (x3(aVar)) {
                            length = v5.r(((TL_iv.pageBlockDetails) aVar.f47028b).title, null, true).length();
                        } else {
                            pageBlock = aVar.f47028b;
                            if (((pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote) && !C3(pageBlock)) || (spannableStringBuilderA = t5.A(aVar.f47028b)) == null) {
                                length = 0;
                            }
                        }
                        if (charSequenceSubSequence2.length() > 0) {
                            TL_iv.PageBlock pageBlockS4 = S3(aVar2.f47028b);
                            t5.e(pageBlockS4, charSequenceSubSequence2);
                            arrayList2.add(new a(pageBlockS4, aVar2.f47029c, aVar2.d));
                        }
                        while (i11 >= i10) {
                            arrayList3.remove(i11);
                            i11--;
                        }
                        for (i15 = 0; i15 < arrayList2.size(); i15++) {
                            arrayList3.add(i10 + i15, (a) arrayList2.get(i15));
                        }
                    } else {
                        SpannableStringBuilder spannableStringBuilderA2 = t5.A(((a) arrayList.get(0)).f47028b);
                        CharSequence charSequence = spannableStringBuilderA2 != null ? spannableStringBuilderA2 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(charSequenceSubSequence2);
                        t5.e(aVar.f47028b, spannableStringBuilder);
                        while (i11 > i10) {
                            arrayList3.remove(i11);
                            i11--;
                        }
                    }
                    s4();
                    this.f47352j3.f(false);
                    this.U2.N(false);
                    b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    post(new k2(this, aVar, length, 1));
                    return true;
                }
                i11 = i10;
                i10 = i11;
                i13 = i12;
                i12 = i13;
                while (i14 <= i11) {
                    aVar3 = (a) arrayList3.get(i14);
                    if (aVar3.f47033i) {
                    }
                }
                aVar = (a) arrayList3.get(i10);
                aVar2 = (a) arrayList3.get(i11);
                charSequenceA = t5.A(aVar.f47028b);
                if (i10 == i11) {
                    charSequenceA2 = charSequenceA;
                } else {
                    charSequenceA2 = t5.A(aVar2.f47028b);
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (charSequenceA2 == null) {
                    charSequenceA2 = "";
                }
                int iMax3 = Math.max(0, Math.min(i12, charSequenceA.length()));
                int iMax4 = Math.max(0, Math.min(i13, charSequenceA2.length()));
                charSequenceSubSequence = charSequenceA.subSequence(0, iMax3);
                charSequenceSubSequence2 = charSequenceA2.subSequence(iMax4, charSequenceA2.length());
                b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (arrayList.size() == 1) {
                    arrayList2 = new ArrayList(arrayList);
                    if (charSequenceSubSequence.length() > 0) {
                        TL_iv.PageBlock pageBlockS5 = S3(aVar.f47028b);
                        t5.e(pageBlockS5, charSequenceSubSequence);
                        arrayList2.add(0, new a(pageBlockS5, aVar.f47029c, aVar.d));
                    }
                    aVar = (a) i0.a.i(1, arrayList);
                    if (aVar == null) {
                        length = 0;
                    } else if (x3(aVar)) {
                        length = v5.r(((TL_iv.pageBlockDetails) aVar.f47028b).title, null, true).length();
                    } else {
                        pageBlock = aVar.f47028b;
                        length = pageBlock instanceof TL_iv.pageBlockParagraph ? spannableStringBuilderA.length() : spannableStringBuilderA.length();
                    }
                    if (charSequenceSubSequence2.length() > 0) {
                        TL_iv.PageBlock pageBlockS6 = S3(aVar2.f47028b);
                        t5.e(pageBlockS6, charSequenceSubSequence2);
                        arrayList2.add(new a(pageBlockS6, aVar2.f47029c, aVar2.d));
                    }
                    while (i11 >= i10) {
                        arrayList3.remove(i11);
                        i11--;
                    }
                    while (i15 < arrayList2.size()) {
                        arrayList3.add(i10 + i15, (a) arrayList2.get(i15));
                    }
                } else {
                    arrayList2 = new ArrayList(arrayList);
                    if (charSequenceSubSequence.length() > 0) {
                        TL_iv.PageBlock pageBlockS7 = S3(aVar.f47028b);
                        t5.e(pageBlockS7, charSequenceSubSequence);
                        arrayList2.add(0, new a(pageBlockS7, aVar.f47029c, aVar.d));
                    }
                    aVar = (a) i0.a.i(1, arrayList);
                    if (aVar == null) {
                        length = 0;
                    } else if (x3(aVar)) {
                        length = v5.r(((TL_iv.pageBlockDetails) aVar.f47028b).title, null, true).length();
                    } else {
                        pageBlock = aVar.f47028b;
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        }
                    }
                    if (charSequenceSubSequence2.length() > 0) {
                        TL_iv.PageBlock pageBlockS8 = S3(aVar2.f47028b);
                        t5.e(pageBlockS8, charSequenceSubSequence2);
                        arrayList2.add(new a(pageBlockS8, aVar2.f47029c, aVar2.d));
                    }
                    while (i11 >= i10) {
                        arrayList3.remove(i11);
                        i11--;
                    }
                    while (i15 < arrayList2.size()) {
                        arrayList3.add(i10 + i15, (a) arrayList2.get(i15));
                    }
                }
                s4();
                this.f47352j3.f(false);
                this.U2.N(false);
                b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                post(new k2(this, aVar, length, 1));
                return true;
            }
        }
        return false;
    }

    public final boolean J3(int i10, int i11, int i12, int i13, int i14) {
        boolean zI;
        int length;
        int iY;
        int iD;
        int iMax;
        int iMax2;
        if (y3()) {
            d1 d1VarI2 = I2(i11);
            if (d1VarI2 == null || (iMax = Math.max(0, Math.min(Math.min(i12, i14), d1VarI2.length()))) >= (iMax2 = Math.max(0, Math.min(Math.max(i12, i14), d1VarI2.length()))) || (i10 & d1VarI2.getCurrentStyle(iMax, iMax2)) == 0) {
                return false;
            }
            return true;
        }
        if (!G3()) {
            int i15 = i11;
            boolean z10 = false;
            while (i15 <= i13) {
                a aVarY4 = y4(i15);
                if (aVarY4 != null) {
                    TL_iv.PageBlock pageBlock = aVarY4.f47028b;
                    if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int iI2 = i2(i15);
                        int i16 = i15 == i11 ? i12 : 0;
                        int i17 = i15 == i13 ? i14 : iI2;
                        int iMax3 = Math.max(0, Math.min(i16, iI2));
                        int iMax4 = Math.max(0, Math.min(i17, iI2));
                        if (iMax3 < iMax4) {
                            t5 t5VarU2 = u2(i15);
                            if (t5VarU2 != null) {
                                zI = (t5VarU2.getStyleDelegate().getCurrentStyle(iMax3, iMax4) & i10) != 0;
                            } else {
                                zI = v5.i(iMax3, iMax4, i10, t5.A(y4(i15).f47028b));
                            }
                            if (zI) {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i15++;
            }
            return z10;
        }
        d1 d1VarJ4 = j4(i11);
        if (d1VarJ4 != null && (iY = pa.y(i12, i14, (length = d1VarJ4.length()), 0)) < (iD = pa.d(i12, i14, length, 0)) && (i10 & d1VarJ4.getCurrentStyle(iY, iD)) != 0) {
            return true;
        }
        return false;
    }

    public final void J4(View view) {
        f2.o1 o1VarT;
        int iB;
        if (view == null || this.V2 == null || !this.Y2 || (o1VarT = T(view)) == null || (iB = o1VarT.b()) < 0 || this.U2.H(iB) < 0) {
            return;
        }
        this.f47370w3 = true;
        d3 d3Var = this.f47352j3;
        if (d3Var.y()) {
            d3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.V2.r(o1VarT);
    }

    public final boolean K3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i12;
        boolean z10 = false;
        while (i16 <= i14) {
            d1 d1VarN4 = N4(i11, i16);
            if (d1VarN4 != null) {
                int length = d1VarN4.length();
                int iMin = i16 == i12 ? i13 : 0;
                int iMax = i16 == i14 ? i15 : length;
                if (i12 == i14) {
                    iMin = Math.min(i13, i15);
                    iMax = Math.max(i13, i15);
                }
                int iMax2 = Math.max(0, Math.min(iMin, length));
                int iMax3 = Math.max(0, Math.min(iMax, length));
                if (iMax2 >= iMax3) {
                    continue;
                } else {
                    if ((d1VarN4.getCurrentStyle(iMax2, iMax3) & i10) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i16++;
        }
        return z10;
    }

    public final void K4(a aVar, s sVar, MediaController.PhotoEntry photoEntry) {
        long j10;
        s4 s4Var = (s4) this.V3.remove(sVar);
        if (s4Var != null) {
            s4Var.b();
        }
        IdentityHashMap identityHashMap = this.W3;
        o4 o4Var = (o4) identityHashMap.remove(sVar);
        if (o4Var != null) {
            o4Var.a();
        }
        sVar.f47414a = 1;
        sVar.f47418f = 0.0f;
        o4 o4Var2 = new o4(this.f47336b3, photoEntry, new b3(aVar, sVar, this));
        identityHashMap.put(sVar, o4Var2);
        if (o4Var2.f47320f || o4Var2.h || o4Var2.f47321n) {
            return;
        }
        o4Var2.f47320f = true;
        int i10 = photoEntry.width;
        int i11 = photoEntry.height;
        if (i10 <= 0 || i11 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(photoEntry.path, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        VideoEditedInfo videoEditedInfo = null;
        arrayList = null;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        videoEditedInfo = null;
        if (i10 > 0 && i11 > 0) {
            int i12 = photoEntry.orientation;
            if (i12 == 90 || i12 == 270) {
                int i13 = i11;
                i11 = i10;
                i10 = i13;
            }
            VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
            videoEditedInfo2.startTime = 0L;
            videoEditedInfo2.start = 0L;
            videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
            while (true) {
                j10 = videoEditedInfo2.endTime;
                if (j10 <= 0 || j10 >= 1000) {
                    break;
                } else {
                    videoEditedInfo2.endTime = j10 * 2;
                }
            }
            if (j10 <= 0) {
                videoEditedInfo2.endTime = 3000L;
            }
            long j11 = videoEditedInfo2.endTime;
            float f10 = j11;
            videoEditedInfo2.end = f10;
            videoEditedInfo2.compressQuality = 1;
            videoEditedInfo2.rotationValue = 0;
            videoEditedInfo2.originalPath = photoEntry.path;
            videoEditedInfo2.estimatedSize = (int) ((f10 / 1000.0f) * 115200.0f);
            videoEditedInfo2.estimatedDuration = j11;
            videoEditedInfo2.framerate = 30;
            videoEditedInfo2.originalDuration = j11;
            videoEditedInfo2.filterState = photoEntry.savedFilterState;
            String str = photoEntry.croppedPaintPath;
            if (str != null) {
                videoEditedInfo2.paintPath = str;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = photoEntry.croppedMediaEntities;
                }
                videoEditedInfo2.mediaEntities = arrayList;
            } else {
                videoEditedInfo2.paintPath = photoEntry.paintPath;
                videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
            }
            videoEditedInfo2.isPhoto = true;
            MediaController.CropState cropState = photoEntry.cropState;
            if (cropState != null) {
                int i14 = cropState.transformRotation;
                if (i14 == 90 || i14 == 270) {
                    int i15 = i11;
                    i11 = i10;
                    i10 = i15;
                }
                i10 = (int) (i10 * cropState.cropPw);
                i11 = (int) (i11 * cropState.cropPh);
            }
            float f11 = i10;
            float f12 = i11;
            float fMax = Math.max(f11 / 854.0f, f12 / 854.0f);
            if (fMax < 1.0f) {
                fMax = 1.0f;
            }
            int iMax = (int) (f11 / fMax);
            int iMax2 = (int) (f12 / fMax);
            if (iMax % 16 != 0) {
                iMax = Math.max(1, Math.round(iMax / 16.0f)) * 16;
            }
            if (iMax2 % 16 != 0) {
                iMax2 = Math.max(1, Math.round(iMax2 / 16.0f)) * 16;
            }
            videoEditedInfo2.resultWidth = iMax;
            videoEditedInfo2.originalWidth = iMax;
            videoEditedInfo2.resultHeight = iMax2;
            videoEditedInfo2.originalHeight = iMax2;
            videoEditedInfo2.bitrate = -1;
            videoEditedInfo2.muted = true;
            videoEditedInfo2.avatarStartTime = 0L;
            videoEditedInfo = videoEditedInfo2;
        }
        o4Var2.d = videoEditedInfo;
        if (videoEditedInfo == null || !videoEditedInfo.needConvert()) {
            o4Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22401id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        o4Var2.f47319e = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(o4Var2.f47316a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        o4Var2.f47318c = messageObject;
        messageObject.videoEditedInfo = o4Var2.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(o4Var2.f47316a);
        notificationCenter.addObserver(o4Var2, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(o4Var2, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(o4Var2, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(o4Var2.f47318c, false, false, false);
    }

    public final boolean L3() {
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y()) {
            return false;
        }
        int i10 = d3Var.f24540u0;
        int i11 = d3Var.f24543x0;
        a aVarY4 = y4(i10);
        return i10 == i11 && aVarY4 != null && (aVarY4.f47028b instanceof TL_iv.pageBlockTable);
    }

    public final void L4(a aVar, s sVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.V3;
        s4 s4Var = (s4) identityHashMap.remove(sVar);
        if (s4Var != null) {
            s4Var.b();
        }
        s4 s4Var2 = new s4(this.f47336b3, str, z10, i10, i11, i12, new c3(aVar, sVar, this));
        identityHashMap.put(sVar, s4Var2);
        s4Var2.d();
    }

    public final void M2() {
        if (this.f47371x3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f47371x3 = false;
        this.f47372y3 = false;
        this.f47373z3 = null;
        this.A3 = null;
        b70 b70Var = this.f47345f4;
        if (b70Var != null) {
            this.f47345f4 = null;
            b70Var.u();
        }
        g5 g5Var = this.f47343e4;
        if (g5Var != null) {
            LinkedHashSet linkedHashSet = g5Var.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                g5Var.v.invalidate();
                g5Var.t();
            }
            this.f47343e4 = null;
        }
        this.f47349h4 = -1;
        this.f47347g4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f47336b3).config;
        int i10 = 0;
        int size = 0;
        while (true) {
            ArrayList arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            size += Q3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList arrayListZ2 = Z2();
        c2 c2Var = new c2();
        c2Var.d = size;
        c2Var.f47082b = arrayListZ2.size() + c2Var.f47082b;
        for (int i11 = 0; i11 < arrayListZ2.size(); i11++) {
            c2.b((TL_iv.PageBlock) arrayListZ2.get(i11), 1, c2Var);
        }
        return c2Var.f47081a <= appGlobalConfig.richMessageLengthLimit.get() && c2Var.f47082b <= appGlobalConfig.richMessageMaxBlocks.get() && c2Var.f47083c <= appGlobalConfig.richMessageMaxDepth.get() && c2Var.d <= appGlobalConfig.richMessageMaxMedia.get() && c2Var.f47084e <= appGlobalConfig.richMessageMaxTableCols.get();
    }

    public final Editable M4(a aVar) {
        View viewZ1 = z1(aVar);
        return viewZ1 instanceof t5 ? ((t5) viewZ1).getEditText().getText() : t5.A(aVar.f47028b);
    }

    public final d1 N4(int i10, int i11) {
        View viewA4 = A4(i10);
        if (viewA4 instanceof g5) {
            return ((g5) viewA4).l(i11);
        }
        return null;
    }

    public final int[] O3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.J3.size(); i12++) {
            int length = t5.z(((a) this.J3.get(i12)).f47028b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.J3.size() - 1;
        return new int[]{size, t5.z(((a) this.J3.get(size)).f47028b).length()};
    }

    public final d1 P2() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof d1) {
            return (d1) viewFindFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                return ((t5) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f47348h3;
            if (i12 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i12);
            if (x3(aVar)) {
                i11++;
            } else if (aVar.f47033i && (i11 = i11 - 1) == 0) {
                return i12;
            }
            i12++;
        }
    }

    public final a Q2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                if (t5Var.getEditText().isFocused() || (t5Var.n() && t5Var.h.isFocused())) {
                    return t5Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        int[] iArrB4 = B4();
        if (iArrB4 == null) {
            return;
        }
        int i10 = iArrB4[0];
        int i11 = iArrB4[1];
        if (i10 >= 0) {
            ArrayList arrayList = this.f47348h3;
            if (i11 >= arrayList.size() || i10 > i11) {
                return;
            }
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            if (H3(i10, i11)) {
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    boolean z10 = aVar.f47033i;
                    ArrayList arrayList2 = aVar.f47035k;
                    if (!z10 && !x3(aVar)) {
                        if (t5.p(aVar.f47028b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.f47028b.text;
                            aVar.f47028b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            a9.p.s(1, arrayList2);
                        }
                    }
                }
            } else {
                long jA = m0.a();
                for (int i13 = i10; i13 <= i11; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    boolean z11 = aVar2.f47033i;
                    ArrayList arrayList3 = aVar2.f47035k;
                    if (!z11 && !x3(aVar2)) {
                        if (t5.p(aVar2.f47028b)) {
                            long jA2 = m0.a();
                            TL_iv.RichText richTextK = t5.k(aVar2.f47028b);
                            if (richTextK != null && !(richTextK instanceof TL_iv.textEmpty)) {
                                this.f47350i3.put(Long.valueOf(jA2), richTextK);
                            }
                            arrayList3.add(Long.valueOf(jA2));
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = aVar2.f47028b.text;
                            aVar2.f47028b = pageblockparagraph2;
                        }
                        arrayList3.add(0, Long.valueOf(jA));
                    }
                }
            }
            x2();
            V3();
            s4();
            d3 d3Var = this.f47352j3;
            boolean z12 = d3Var != null && d3Var.y();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
            this.U2.N(false);
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            if (z12) {
                post(new qf.a(this, aVar3, aVar4, 9));
            } else {
                post(new i2(this, aVar3, 9));
            }
        }
    }

    public final void R1(TL_iv.PageBlock pageBlock) {
        a aVar;
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVarQ2 = Q2();
        if (aVarQ2 == null) {
            aVarQ2 = this.Y3;
        }
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = aVarQ2 != null ? arrayList.indexOf(aVarQ2) : -1;
        if (iIndexOf >= 0 && (aVarQ2.f47028b instanceof TL_iv.pageBlockBlockquote)) {
            long jA = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVarQ2.f47028b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.f47350i3.put(Long.valueOf(jA), richText);
            }
            aVarQ2.f47035k.add(Long.valueOf(jA));
            aVarQ2.f47028b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = iIndexOf >= 0 && !aVarQ2.f47035k.isEmpty();
        if (iIndexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = aVarQ2.f47028b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && aVarQ2.f47032g == null && t5.z(pageBlock2).isEmpty()) {
                aVarQ2.f47028b = pageBlock;
            } else {
                aVar = new a(pageBlock, 0, 0);
                if (z10) {
                    aVar.f47035k.addAll(aVarQ2.f47035k);
                }
                if (iIndexOf >= 0) {
                    arrayList.add(iIndexOf + 1, aVar);
                } else {
                    arrayList.add(aVar);
                }
                aVarQ2 = aVar;
            }
        } else {
            aVar = new a(pageBlock, 0, 0);
            if (z10) {
                aVar.f47035k.addAll(aVarQ2.f47035k);
            }
            if (iIndexOf >= 0) {
                arrayList.add(iIndexOf + 1, aVar);
            } else {
                arrayList.add(aVar);
            }
            aVarQ2 = aVar;
        }
        this.Y3 = aVarQ2;
        if (l3(pageBlock)) {
            int iIndexOf2 = arrayList.indexOf(aVarQ2) + 1;
            if (iIndexOf2 >= arrayList.size() || E3(((a) arrayList.get(iIndexOf2)).f47028b)) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                if (z10) {
                    aVar2.f47035k.addAll(aVarQ2.f47035k);
                }
                arrayList.add(iIndexOf2, aVar2);
                aVarQ2 = aVar2;
            } else {
                aVarQ2 = (a) arrayList.get(iIndexOf2);
            }
        }
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, aVarQ2, 1));
    }

    public final g5 R2() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof d1) {
            return U2((d1) viewFindFocus);
        }
        return null;
    }

    public final void R4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        a aVar2;
        b2 b2Var;
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf < 0) {
            return;
        }
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.d();
        }
        aVar.f47028b = pageBlock;
        aVar.f47029c = i10;
        aVar.d = i11;
        aVar.f47030e = z10;
        aVar.f47031f = z11;
        s4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (!z12) {
            if (E3(pageBlock)) {
                if (D3(pageBlock) && aVar.f47032g == null) {
                    aVar.f47032g = new s();
                }
                int i12 = iIndexOf + 1;
                if (i12 >= arrayList.size() || E3(((a) arrayList.get(i12)).f47028b)) {
                    aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    arrayList.add(i12, aVar2);
                } else {
                    aVar2 = (a) arrayList.get(i12);
                }
            }
            if (aVar2 == aVar || z12 || E3(pageBlock) || !(findFocus() instanceof d1)) {
                this.U2.N(false);
                b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.h();
                }
                post(new i2(this, aVar2, 18));
            }
            X1();
            b2 b2Var3 = this.F3;
            if (b2Var3 != null) {
                b2Var3.h();
            }
            View viewZ1 = z1(aVar);
            if (viewZ1 instanceof t5) {
                t5 t5Var = (t5) viewZ1;
                t5Var.B();
                t5Var.getEditText().setSelection(t5Var.getEditText().length());
                return;
            }
            return;
        }
        int i13 = iIndexOf + 1;
        if (i13 >= arrayList.size() || E3(((a) arrayList.get(i13)).f47028b)) {
            arrayList.add(i13, new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.U2.N(false);
        b2Var = this.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        post(new i2(this, aVar2, 18));
    }

    public final TLRPC.Document S2(long j10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j10 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f47348h3.size(); i11++) {
            for (s sVar : Q3((a) this.f47348h3.get(i11))) {
                if (sVar != null && (document2 = sVar.h) != null && document2.f22386id == j10) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f47346g3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.Document document3 = arrayList.get(i10);
                i10++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f22386id == j10) {
                    return document4;
                }
            }
        }
        HashMap map = n4.f47299a;
        synchronized (n4.class) {
            document = j10 != 0 ? (TLRPC.Document) n4.f47300b.get(Long.valueOf(j10)) : null;
        }
        return document;
    }

    public final boolean S4() {
        g5 g5Var;
        int[] iArrA5;
        int[] iArrA6;
        boolean z10;
        int i10;
        ArrayList arrayList;
        int size;
        a aVar;
        String strL;
        int length;
        v9 v9Var;
        h7.j0 j0Var;
        int i11;
        KeyEvent.Callback childAt;
        i9 i9Var;
        a aVar2;
        long j10;
        String strL2;
        boolean zK0;
        int length2;
        i0 i0Var;
        t5 t5Var;
        int iK;
        if (this.f47348h3.isEmpty()) {
            return false;
        }
        d3 d3Var = this.f47352j3;
        boolean zY = d3Var.y();
        SparseIntArray sparseIntArray = d3Var.D0;
        org.telegram.ui.Cells.g gVar = d3Var.f25890r0;
        i9 i9Var2 = null;
        if (zY) {
            int i12 = d3Var.f24540u0;
            if (i12 != d3Var.f24543x0) {
                z10 = false;
            } else {
                View viewA4 = A4(i12);
                if ((viewA4 instanceof g5) && !(((iArrA5 = a5((g5Var = (g5) viewA4))) != null && d3Var.f24541v0 == 0 && d3Var.f24542w0 == 0 && d3Var.f24544y0 == iArrA5[0] && d3Var.f24545z0 == iArrA5[1]) || (iArrA6 = a5(g5Var)) == null)) {
                    int i13 = iArrA6[0];
                    int i14 = iArrA6[1];
                    ArrayList arrayList2 = d3Var.F0;
                    int iE0 = d3Var.e0(g5Var);
                    if (iE0 >= 0 && !(i13 == 0 && i14 == 0)) {
                        d3Var.W = g5Var;
                        d3Var.f24543x0 = iE0;
                        d3Var.f24540u0 = iE0;
                        d3Var.f24541v0 = 0;
                        d3Var.f24544y0 = i13;
                        d3Var.f24542w0 = 0;
                        d3Var.f24545z0 = i14;
                        d3Var.f25895u = 0;
                        d3Var.v = i14;
                        d3Var.G0 = iE0;
                        d3Var.I0 = 0;
                        d3Var.H0 = 0;
                        d3Var.i0(g5Var, iE0);
                        arrayList2.clear();
                        g5Var.fillTextLayoutBlocks(arrayList2);
                        if ((!arrayList2.isEmpty() && arrayList2.size() > 0) || !arrayList2.isEmpty()) {
                            d3Var.f25858a = ((u9) arrayList2.get(0)).getX();
                            d3Var.f25860b = ((u9) arrayList2.get(0)).getY();
                        }
                        v9 v9Var2 = d3Var.C;
                        if (v9Var2 != null) {
                            v9Var2.setVisibility(0);
                        }
                        d3Var.V();
                        d3Var.x();
                        d3Var.v();
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        h7.j0 j0Var2 = d3Var.D;
                        if (j0Var2 != null) {
                            j0Var2.a(true);
                        }
                        g5Var.invalidate();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                i10 = 0;
                while (true) {
                    arrayList = this.f47357l4;
                    if (i10 < arrayList.size()) {
                        break;
                        break;
                    }
                    aVar2 = (a) arrayList.get(i10);
                    j10 = aVar2.f47044t;
                    if (j10 != 0) {
                        d3Var.Y(i10, v5.l((TL_iv.RichText) this.f47350i3.get(Long.valueOf(j10))));
                    } else {
                        d3Var.Y(i10, t5.z(aVar2.f47028b));
                        if (t5.p(aVar2.f47028b)) {
                            strL2 = v5.l(t5.k(aVar2.f47028b));
                            if (!strL2.isEmpty()) {
                                d3Var.B0.put(65536 + i10, j9.Z(strL2));
                                sparseIntArray.put(i10, Math.max(2, sparseIntArray.get(i10)));
                            }
                        }
                    }
                    i10++;
                }
                size = arrayList.size() - 1;
                aVar = (a) arrayList.get(size);
                if (aVar.f47044t == 0) {
                    strL = "";
                } else {
                    strL = "";
                }
                if (!strL.isEmpty()) {
                    d3Var.j0(0, size);
                    return true;
                }
                length = strL.length();
                if (size >= 0) {
                    if (d3Var.F != null) {
                        for (i11 = 0; i11 < d3Var.F.getChildCount(); i11++) {
                            childAt = d3Var.F.getChildAt(i11);
                            if (childAt instanceof i9) {
                                i9Var = (i9) childAt;
                                if (d3Var.e0(i9Var) == size) {
                                    i9Var2 = i9Var;
                                    break;
                                }
                            }
                        }
                    }
                    d3Var.W = i9Var2;
                    d3Var.f25895u = 0;
                    d3Var.v = length;
                    d3Var.f24540u0 = 0;
                    d3Var.f24543x0 = size;
                    d3Var.f24541v0 = 0;
                    d3Var.f24544y0 = 1;
                    d3Var.f24542w0 = 0;
                    d3Var.f24545z0 = length;
                    sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
                    sparseIntArray.put(size, Math.max(2, sparseIntArray.get(size)));
                    d3Var.G0 = 0;
                    d3Var.I0 = 0;
                    d3Var.H0 = 0;
                    v9Var = d3Var.C;
                    if (v9Var != null) {
                        v9Var.setVisibility(0);
                    }
                    d3Var.V();
                    d3Var.x();
                    d3Var.v();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    j0Var = d3Var.D;
                    if (j0Var != null) {
                        j0Var.a(true);
                    }
                }
            }
        } else {
            d1 d1VarP2 = P2();
            if (d1VarP2 == 0 || d1VarP2.getText() == null || (length2 = d1VarP2.getText().length()) <= 0) {
                zK0 = false;
            } else {
                g5 g5VarU2 = U2(d1VarP2);
                if (g5VarU2 != null) {
                    if (d1VarP2 == g5VarU2.getTitleEditText()) {
                        iK = 0;
                    } else {
                        j5 j5VarO = g5VarU2.o(d1VarP2);
                        iK = j5VarO != null ? g5VarU2.k(j5VarO.f47227b) : -1;
                    }
                    if (iK < 0) {
                        zK0 = false;
                    } else {
                        d1VarP2.setSelection(d1VarP2.getSelectionEnd());
                        zK0 = d3Var.k0(g5VarU2, iK, 0, length2);
                    }
                } else {
                    if (!(d1VarP2 instanceof i0)) {
                        ViewParent parent = d1VarP2.getParent();
                        while (true) {
                            if (parent == null) {
                                i0Var = null;
                                break;
                            }
                            if (parent instanceof i0) {
                                i0Var = (i0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        i0Var = (i0) d1VarP2;
                    }
                    if (i0Var instanceof i9) {
                        d1VarP2.setSelection(d1VarP2.getSelectionEnd());
                        zK0 = d3Var.k0((i9) i0Var, 0, 0, length2);
                    } else {
                        ViewParent parent2 = d1VarP2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                t5Var = null;
                                break;
                            }
                            if (parent2 instanceof t5) {
                                t5Var = (t5) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (t5Var != null) {
                            int i15 = d1VarP2 == t5Var.getAuthorEditText() ? 1 : 0;
                            d1VarP2.setSelection(d1VarP2.getSelectionEnd());
                            zK0 = d3Var.k0(t5Var, i15, 0, length2);
                        } else {
                            zK0 = false;
                        }
                    }
                }
            }
            if (!zK0) {
                i10 = 0;
                while (true) {
                    arrayList = this.f47357l4;
                    if (i10 < arrayList.size()) {
                        break;
                    }
                    aVar2 = (a) arrayList.get(i10);
                    j10 = aVar2.f47044t;
                    if (j10 != 0) {
                        d3Var.Y(i10, v5.l((TL_iv.RichText) this.f47350i3.get(Long.valueOf(j10))));
                    } else {
                        d3Var.Y(i10, t5.z(aVar2.f47028b));
                        if (t5.p(aVar2.f47028b)) {
                            strL2 = v5.l(t5.k(aVar2.f47028b));
                            if (!strL2.isEmpty()) {
                                d3Var.B0.put(65536 + i10, j9.Z(strL2));
                                sparseIntArray.put(i10, Math.max(2, sparseIntArray.get(i10)));
                            }
                        }
                    }
                    i10++;
                }
                size = arrayList.size() - 1;
                aVar = (a) arrayList.get(size);
                if (aVar.f47044t == 0 || !t5.p(aVar.f47028b)) {
                    strL = "";
                } else {
                    strL = v5.l(t5.k(aVar.f47028b));
                }
                if (!strL.isEmpty()) {
                    d3Var.j0(0, size);
                    return true;
                }
                length = strL.length();
                if (size >= 0) {
                    if (d3Var.F != null) {
                        while (i11 < d3Var.F.getChildCount()) {
                            childAt = d3Var.F.getChildAt(i11);
                            if (childAt instanceof i9) {
                                i9Var = (i9) childAt;
                                if (d3Var.e0(i9Var) == size) {
                                    i9Var2 = i9Var;
                                    break;
                                }
                            }
                        }
                    }
                    d3Var.W = i9Var2;
                    d3Var.f25895u = 0;
                    d3Var.v = length;
                    d3Var.f24540u0 = 0;
                    d3Var.f24543x0 = size;
                    d3Var.f24541v0 = 0;
                    d3Var.f24544y0 = 1;
                    d3Var.f24542w0 = 0;
                    d3Var.f24545z0 = length;
                    sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
                    sparseIntArray.put(size, Math.max(2, sparseIntArray.get(size)));
                    d3Var.G0 = 0;
                    d3Var.I0 = 0;
                    d3Var.H0 = 0;
                    v9Var = d3Var.C;
                    if (v9Var != null) {
                        v9Var.setVisibility(0);
                    }
                    d3Var.V();
                    d3Var.x();
                    d3Var.v();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    j0Var = d3Var.D;
                    if (j0Var != null) {
                        j0Var.a(true);
                    }
                }
            }
        }
        return true;
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        p3 p3Var;
        if (aVar != null && D3(aVar.f47028b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                s sVarT3 = T3(photoEntry, str2);
                boolean zC = o4.c(photoEntry);
                TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || zC) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (B3(aVar.f47028b)) {
                    g3(aVar.f47028b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(sVarT3);
                } else {
                    s sVar = aVar.f47032g;
                    if (sVar == null || sVar.f47414a == 0) {
                        aVar.f47028b = pageblockvideo;
                        aVar.f47032g = sVarT3;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f47028b.caption;
                        h0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f47028b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f47032g);
                        aVar.h.add(sVarT3);
                        aVar.f47032g = null;
                        aVar.f47028b = pageblockcollage;
                    }
                }
                this.U2.N(false);
                n4(aVar);
                if (zC) {
                    K4(aVar, sVarT3, photoEntry);
                    p3Var = this;
                } else {
                    p3Var = this;
                    p3Var.L4(aVar, sVarT3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.f47340d3.onContentChanged();
            }
        }
    }

    public final int T2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f47033i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (x3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.f47028b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.f47033i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f47028b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean T4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: rh.p3.T4(android.view.View, float, float):boolean");
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int iIndexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.f47346g3;
        if (richMessage2 == null) {
            this.f47346g3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.f47346g3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        W2(arrayList4, richMessage.blocks, this.f47350i3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            v4((a) arrayList4.get(i10));
        }
        ArrayList arrayList5 = this.f47348h3;
        int size = arrayList5.size();
        a aVarQ2 = Q2();
        if (aVarQ2 != null && (iIndexOf = arrayList5.indexOf(aVarQ2)) >= 0) {
            TL_iv.PageBlock pageBlock = aVarQ2.f47028b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && t5.z(pageBlock).isEmpty()) {
                arrayList5.remove(iIndexOf);
                size = iIndexOf;
            } else {
                size = iIndexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        V3();
        s4();
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.onContentChanged();
        }
    }

    public final a U3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f47357l4;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f47033i) {
                if (aVar.f47044t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.f47028b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i10 += i11;
        }
        return null;
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.f47348h3;
        if (arrayList.indexOf(aVar2) < 0 || x3(aVar2) || aVar2.f47033i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.f47028b;
        if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
            t5 t5VarU2 = u2(arrayList.indexOf(aVar2));
            t5.e(pageBlock, t5VarU2 != null ? t5VarU2.getEditText().getText() : t5.A(aVar2.f47028b));
            TL_iv.RichText richTextK = t5.k(aVar2.f47028b);
            if (richTextK != null && t5.k(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = richTextK;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = richTextK;
                }
            }
        }
        R4(aVar2, pageBlock, i10, i11, z10, z11);
    }

    public final a V1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f47357l4;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf < 0 || (i11 = iIndexOf + i10) < 0 || i11 >= arrayList.size()) {
            return null;
        }
        a aVar2 = (a) arrayList.get(i11);
        if (aVar2.f47044t != 0) {
            return aVar2;
        }
        return null;
    }

    public final void V2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                t5Var.f47482f.n();
                t5Var.h.n();
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().n();
            }
        }
    }

    public final void V3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f47035k.isEmpty() && t5.p(aVar.f47028b)) {
                long jA = m0.a();
                TL_iv.RichText richTextK = t5.k(aVar.f47028b);
                if (richTextK != null && !(richTextK instanceof TL_iv.textEmpty)) {
                    this.f47350i3.put(Long.valueOf(jA), richTextK);
                }
                aVar.f47035k.add(Long.valueOf(jA));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.f47028b.text;
                aVar.f47028b = pageblockparagraph;
            }
            i10++;
        }
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        U4(aVar2, pageBlock, aVar2.f47029c, aVar2.d, aVar2.f47030e, aVar2.f47031f);
    }

    public final boolean W1(int i10, int i11, int i12, int i13, String[] strArr) {
        g5 g5Var;
        x5 model;
        int iMax;
        int length;
        int length2;
        int i14;
        ?? r10;
        int length3;
        b2 b2Var;
        int i15 = i11;
        int i16 = i13;
        a aVarY4 = y4(i10);
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = arrayList.indexOf(aVarY4);
        int iIndexOf2 = arrayList.indexOf(y4(i12));
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf < arrayList.size() && iIndexOf2 < arrayList.size()) {
            a aVar = (a) arrayList.get(iIndexOf);
            a aVar2 = (a) arrayList.get(iIndexOf2);
            d3 d3Var = this.f47352j3;
            if (iIndexOf == iIndexOf2 && x3(aVar)) {
                View viewZ1 = z1(aVar);
                if ((viewZ1 instanceof q0) && (aVar.f47028b instanceof TL_iv.pageBlockDetails)) {
                    d1 editText = ((q0) viewZ1).getEditText();
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.d();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i17 = 0; i17 < strArr.length; i17++) {
                        if (i17 > 0) {
                            sb2.append(' ');
                        }
                        sb2.append(strArr[i17]);
                    }
                    String string = sb2.toString();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
                    int length4 = spannableStringBuilder.length();
                    int iY = pa.y(i15, i16, length4, 0);
                    spannableStringBuilder.replace(iY, pa.d(i15, i16, length4, 0), (CharSequence) string);
                    editText.setTextSilently(spannableStringBuilder);
                    editText.invalidateEffects();
                    ((TL_iv.pageBlockDetails) aVar.f47028b).title = v5.f(spannableStringBuilder);
                    int length5 = string.length() + iY;
                    d3Var.f(false);
                    b2 b2Var3 = this.F3;
                    if (b2Var3 != null) {
                        b2Var3.h();
                    }
                    post(new p2(editText, length5, 0));
                    return true;
                }
            } else {
                int i18 = iIndexOf;
                while (true) {
                    b51 b51Var = this.U2;
                    String strSubstring = "";
                    if (i18 > iIndexOf2) {
                        b2 b2Var4 = this.F3;
                        if (b2Var4 != null) {
                            b2Var4.d();
                        }
                        TL_iv.PageBlock pageBlock = aVar.f47028b;
                        boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                        boolean z11 = aVar2.f47028b instanceof TL_iv.pageBlockTable;
                        n3 n3Var = this.f47340d3;
                        if (!z10 && !z11) {
                            boolean zL3 = l3(pageBlock);
                            boolean zL4 = l3(aVar2.f47028b);
                            if (!zL3 && !zL4) {
                                if (iIndexOf == iIndexOf2 && t5.p(aVar.f47028b) && d3Var.f24541v0 == 1 && d3Var.f24544y0 == 1) {
                                    View viewZ2 = z1(aVar);
                                    if (!(viewZ2 instanceof t5)) {
                                        break;
                                    }
                                    t5 t5Var = (t5) viewZ2;
                                    d1 authorEditText = t5Var.getAuthorEditText();
                                    b2 b2Var5 = this.F3;
                                    if (b2Var5 != null) {
                                        b2Var5.d();
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i19 = 0; i19 < strArr.length; i19++) {
                                        if (i19 > 0) {
                                            sb3.append(' ');
                                        }
                                        sb3.append(strArr[i19]);
                                    }
                                    String string2 = sb3.toString();
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(authorEditText.getText());
                                    int length6 = spannableStringBuilder2.length();
                                    int iY2 = pa.y(i15, i16, length6, 0);
                                    spannableStringBuilder2.replace(iY2, pa.d(i15, i16, length6, 0), (CharSequence) string2);
                                    authorEditText.setTextSilently(spannableStringBuilder2);
                                    authorEditText.invalidateEffects();
                                    t5Var.w();
                                    int length7 = string2.length() + iY2;
                                    d3Var.f(false);
                                    b2 b2Var6 = this.F3;
                                    if (b2Var6 != null) {
                                        b2Var6.h();
                                    }
                                    n3Var.onContentChanged();
                                    post(new p2(authorEditText, length7, 1));
                                    return true;
                                }
                                String strZ = t5.z(aVar.f47028b);
                                String strZ2 = iIndexOf == iIndexOf2 ? strZ : t5.z(aVar2.f47028b);
                                int iMax2 = Math.max(0, Math.min(i15, strZ.length()));
                                int iMax3 = Math.max(0, Math.min(i16, strZ2.length()));
                                String strSubstring2 = strZ.substring(0, iMax2);
                                String strSubstring3 = strZ2.substring(iMax3);
                                if (strArr.length <= 1) {
                                    strSubstring = strArr.length != 0 ? strArr[0] : "";
                                    t5.f(aVar.f47028b, strSubstring2 + strSubstring + strSubstring3);
                                    if (iIndexOf2 > iIndexOf) {
                                        while (iIndexOf2 > iIndexOf) {
                                            arrayList.remove(iIndexOf2);
                                            iIndexOf2--;
                                        }
                                    }
                                    length2 = strSubstring.length() + strSubstring2.length();
                                } else {
                                    TL_iv.PageBlock pageBlock2 = aVar.f47028b;
                                    StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strSubstring2);
                                    sbO.append(strArr[0]);
                                    t5.f(pageBlock2, sbO.toString());
                                    if (iIndexOf2 > iIndexOf) {
                                        while (iIndexOf2 > iIndexOf) {
                                            arrayList.remove(iIndexOf2);
                                            iIndexOf2--;
                                        }
                                    }
                                    for (int i20 = 1; i20 < strArr.length - 1; i20++) {
                                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                        Z1(pageblockparagraph, strArr[i20]);
                                        int i21 = iIndexOf + i20;
                                        int i22 = aVar.f47029c;
                                        int i23 = aVar.d;
                                        if (i23 > 0) {
                                            i23 += i20;
                                        }
                                        arrayList.add(i21, new a(pageblockparagraph, i22, i23));
                                    }
                                    String str = strArr[strArr.length - 1];
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    Z1(pageblockparagraph2, str + strSubstring3);
                                    int length8 = (strArr.length + iIndexOf) - 1;
                                    int i24 = aVar.f47029c;
                                    int length9 = aVar.d;
                                    if (length9 > 0) {
                                        length9 = (length9 + strArr.length) - 1;
                                    }
                                    arrayList.add(length8, new a(pageblockparagraph2, i24, length9));
                                    iIndexOf = (iIndexOf + strArr.length) - 1;
                                    length2 = str.length();
                                }
                                s4();
                                a aVar3 = (iIndexOf < 0 || iIndexOf >= arrayList.size()) ? null : (a) arrayList.get(iIndexOf);
                                d3Var.f(false);
                                b51Var.N(false);
                                b2 b2Var7 = this.F3;
                                if (b2Var7 != null) {
                                    b2Var7.h();
                                }
                                post(new k2(this, aVar3, length2, 0));
                                return true;
                            }
                            if (zL3 && zL4 && iIndexOf == iIndexOf2) {
                                KeyEvent.Callback callbackZ1 = z1(aVar);
                                if (!(callbackZ1 instanceof i0)) {
                                    break;
                                }
                                i0 i0Var = (i0) callbackZ1;
                                d1 captionEditText = i0Var.getCaptionEditText();
                                b2 b2Var8 = this.F3;
                                if (b2Var8 != null) {
                                    b2Var8.d();
                                }
                                StringBuilder sb4 = new StringBuilder();
                                for (int i25 = 0; i25 < strArr.length; i25++) {
                                    if (i25 > 0) {
                                        sb4.append(' ');
                                    }
                                    sb4.append(strArr[i25]);
                                }
                                String string3 = sb4.toString();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(captionEditText.getText());
                                int length10 = spannableStringBuilder3.length();
                                int iY3 = pa.y(i15, i16, length10, 0);
                                spannableStringBuilder3.replace(iY3, pa.d(i15, i16, length10, 0), (CharSequence) string3);
                                captionEditText.setTextSilently(spannableStringBuilder3);
                                captionEditText.invalidateEffects();
                                i0Var.b();
                                int length11 = string3.length() + iY3;
                                d3Var.f(false);
                                b2 b2Var9 = this.F3;
                                if (b2Var9 != null) {
                                    b2Var9.h();
                                }
                                post(new p2(captionEditText, length11, 2));
                                return true;
                            }
                        } else if (z10 && z11 && iIndexOf == iIndexOf2) {
                            int i26 = d3Var.f24541v0;
                            int i27 = d3Var.f24544y0;
                            View viewZ3 = z1(aVar);
                            if (!(viewZ3 instanceof g5) || (model = (g5Var = (g5) viewZ3).getModel()) == null) {
                                break;
                                break;
                            }
                            ArrayList arrayList2 = model.f47593g;
                            if (i26 != 0 || i27 != 0) {
                                int i28 = i26 - 1;
                                int i29 = i27 - 1;
                                int size = arrayList2.size();
                                if (i28 < 0 || i28 >= size || i29 < 0 || i29 >= size) {
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                b2 b2Var10 = this.F3;
                                if (b2Var10 != null) {
                                    b2Var10.d();
                                }
                                if (i28 > i29 || (i28 == i29 && i15 > i16)) {
                                    i16 = i15;
                                    i15 = i16;
                                    i29 = i28;
                                    i28 = i29;
                                }
                                StringBuilder sb5 = new StringBuilder();
                                for (int i30 = 0; i30 < strArr.length; i30++) {
                                    if (i30 > 0) {
                                        sb5.append('\n');
                                    }
                                    sb5.append(strArr[i30]);
                                }
                                String string4 = sb5.toString();
                                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i28);
                                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i29);
                                if (i28 == i29) {
                                    String strG = x5.g(pagetablecell);
                                    iMax = Math.max(0, Math.min(i15, strG.length()));
                                    String str2 = strG.substring(0, iMax) + string4 + strG.substring(Math.max(0, Math.min(i16, strG.length())));
                                    x5.c(pagetablecell, str2);
                                    j5 j5VarM = g5Var.getGrid().m(pagetablecell);
                                    if (j5VarM != null) {
                                        j5VarM.f47226a.setTextSilently(str2);
                                    }
                                    length = string4.length();
                                } else {
                                    String strG2 = x5.g(pagetablecell);
                                    iMax = Math.max(0, Math.min(i15, strG2.length()));
                                    String str3 = strG2.substring(0, iMax) + string4;
                                    x5.c(pagetablecell, str3);
                                    j5 j5VarM2 = g5Var.getGrid().m(pagetablecell);
                                    if (j5VarM2 != null) {
                                        j5VarM2.f47226a.setTextSilently(str3);
                                    }
                                    for (int i31 = i28 + 1; i31 < i29; i31++) {
                                        TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i31);
                                        x5.c(pagetablecell3, "");
                                        j5 j5VarM3 = g5Var.getGrid().m(pagetablecell3);
                                        if (j5VarM3 != null) {
                                            j5VarM3.f47226a.setTextSilently("");
                                        }
                                    }
                                    String strG3 = x5.g(pagetablecell2);
                                    String strSubstring4 = strG3.substring(Math.max(0, Math.min(i16, strG3.length())));
                                    x5.c(pagetablecell2, strSubstring4);
                                    j5 j5VarM4 = g5Var.getGrid().m(pagetablecell2);
                                    if (j5VarM4 != null) {
                                        j5VarM4.f47226a.setTextSilently(strSubstring4);
                                    }
                                    length = string4.length();
                                }
                                int i32 = length + iMax;
                                d3Var.f(false);
                                b2 b2Var11 = this.F3;
                                if (b2Var11 != null) {
                                    b2Var11.h();
                                }
                                post(new ol0(g5Var, pagetablecell, i32, 14));
                                return true;
                            }
                            TL_iv.PageBlock pageBlock3 = aVar.f47028b;
                            if (!(pageBlock3 instanceof TL_iv.pageBlockTable)) {
                                break;
                            }
                            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock3;
                            b2 b2Var12 = this.F3;
                            if (b2Var12 != null) {
                                b2Var12.d();
                            }
                            String strL = v5.l(pageblocktable.title);
                            int iMax4 = Math.max(0, Math.min(Math.min(i15, i16), strL.length()));
                            int iMax5 = Math.max(0, Math.min(Math.max(i15, i16), strL.length()));
                            StringBuilder sb6 = new StringBuilder();
                            for (int i33 = 0; i33 < strArr.length; i33++) {
                                if (i33 > 0) {
                                    sb6.append(' ');
                                }
                                sb6.append(strArr[i33]);
                            }
                            String string5 = sb6.toString();
                            String str4 = strL.substring(0, iMax4) + string5 + strL.substring(iMax5);
                            TL_iv.textPlain textplain = new TL_iv.textPlain();
                            textplain.text = str4;
                            pageblocktable.title = textplain;
                            d1 titleEditText = g5Var.getTitleEditText();
                            titleEditText.setTextSilently(str4);
                            titleEditText.invalidateEffects();
                            int length12 = string5.length() + iMax4;
                            d3Var.f(false);
                            b2 b2Var13 = this.F3;
                            if (b2Var13 != null) {
                                b2Var13.h();
                            }
                            n3Var.onContentChanged();
                            post(new p2(titleEditText, length12, 4));
                            return true;
                        }
                    } else {
                        if (((a) arrayList.get(i18)).f47033i || x3((a) arrayList.get(i18))) {
                            int i34 = iIndexOf;
                            while (i34 > 0 && H2(i34) > 0) {
                                i34--;
                            }
                            int i35 = iIndexOf2;
                            while (true) {
                                i14 = i35 + 1;
                                if (i14 >= arrayList.size() || H2(i14) <= 0) {
                                    break;
                                }
                                i35 = i14;
                            }
                            a aVar4 = (a) arrayList.get(iIndexOf);
                            a aVar5 = (a) arrayList.get(iIndexOf2);
                            boolean z12 = i34 != iIndexOf || x3(aVar4) || aVar4.f47033i;
                            boolean z13 = i35 != iIndexOf2 || x3(aVar5) || aVar5.f47033i;
                            StringBuilder sb7 = new StringBuilder();
                            boolean z14 = z12;
                            boolean z15 = z13;
                            for (int i36 = 0; i36 < strArr.length; i36++) {
                                if (i36 > 0) {
                                    sb7.append(' ');
                                }
                                sb7.append(strArr[i36]);
                            }
                            String string6 = sb7.toString();
                            b2 b2Var14 = this.F3;
                            if (b2Var14 != null) {
                                b2Var14.d();
                            }
                            if (z14) {
                                if (z15) {
                                    arrayList.subList(i34, i14).clear();
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    Z1(pageblockparagraph3, string6);
                                    r10 = 0;
                                    aVar4 = new a(pageblockparagraph3, 0, 0);
                                    arrayList.add(Math.min(i34, arrayList.size()), aVar4);
                                    length3 = string6.length();
                                } else {
                                    String strZ3 = t5.z(aVar5.f47028b);
                                    String strSubstring5 = strZ3.substring(Math.max(0, Math.min(i16, strZ3.length())));
                                    t5.f(aVar5.f47028b, string6 + strSubstring5);
                                    arrayList.subList(i34, i35).clear();
                                    length3 = string6.length();
                                    aVar4 = aVar5;
                                }
                                if (arrayList.isEmpty()) {
                                    aVar4 = new a(new TL_iv.pageBlockParagraph(), r10, r10);
                                    arrayList.add(aVar4);
                                    length3 = 0;
                                }
                                s4();
                                d3Var.f(r10);
                                b51Var.N(r10);
                                b2Var = this.F3;
                                if (b2Var != null) {
                                    b2Var.h();
                                }
                                post(new k2(this, aVar4, length3, 3));
                                return true;
                            }
                            String strZ4 = t5.z(aVar4.f47028b);
                            String strSubstring6 = strZ4.substring(0, Math.max(0, Math.min(i15, strZ4.length())));
                            if (!z15) {
                                String strZ5 = t5.z(aVar5.f47028b);
                                strSubstring = strZ5.substring(Math.max(0, Math.min(i16, strZ5.length())));
                            }
                            t5.f(aVar4.f47028b, strSubstring6 + string6 + strSubstring);
                            arrayList.subList(i34 + 1, i14).clear();
                            length3 = string6.length() + strSubstring6.length();
                            r10 = 0;
                            if (arrayList.isEmpty()) {
                                aVar4 = new a(new TL_iv.pageBlockParagraph(), r10, r10);
                                arrayList.add(aVar4);
                                length3 = 0;
                            }
                            s4();
                            d3Var.f(r10);
                            b51Var.N(r10);
                            b2Var = this.F3;
                            if (b2Var != null) {
                                b2Var.h();
                            }
                            post(new k2(this, aVar4, length3, 3));
                            return true;
                        }
                        i18++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean W3(a aVar, boolean z10) {
        int selectionEnd;
        int iIndexOf = this.f47348h3.indexOf(aVar);
        if (iIndexOf >= 0) {
            View viewZ1 = z1(aVar);
            if (viewZ1 instanceof t5) {
                t5 t5Var = (t5) viewZ1;
                if (t5Var.getEditText().isFocused()) {
                    selectionEnd = t5Var.getEditText().getSelectionEnd();
                } else {
                    selectionEnd = -1;
                }
            } else {
                selectionEnd = -1;
            }
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            if (q3(iIndexOf, z10, false)) {
                s4();
                if (findFocus() instanceof d1) {
                    X1();
                } else {
                    this.U2.N(false);
                }
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                if (selectionEnd < 0) {
                    return true;
                }
                post(new k2(this, aVar, selectionEnd, 2));
                return true;
            }
        }
        return false;
    }

    public final void W4(a aVar, int i10) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            U4(aVar2, aVar2.f47028b, 0, 0, false, false);
            return;
        }
        int iMax = Math.max(1, aVar2.f47029c);
        int iMax2 = i10 == 2 ? Math.max(1, aVar2.d) : 0;
        boolean z10 = i10 == 3;
        TL_iv.PageBlock pageblockparagraph = aVar2.f47028b;
        if (!(pageblockparagraph instanceof TL_iv.pageBlockParagraph)) {
            pageblockparagraph = new TL_iv.pageBlockParagraph();
        }
        U4(aVar2, pageblockparagraph, iMax, iMax2, z10, z10 && aVar2.f47031f);
    }

    public final void X1() {
        t5 t5Var;
        a aVar;
        q5 q5Var;
        this.U2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof t5) && (aVar = (t5Var = (t5) childAt).f47487x) != null && (q5Var = t5Var.f47488y) != null) {
                t5Var.g(aVar, q5Var, t5Var.A);
            }
        }
    }

    public final void X3() {
        int length;
        int iY;
        int iD;
        int length2;
        int iY2;
        int iD2;
        int length3;
        int iY3;
        int iD3;
        int length4;
        int iY4;
        int iD4;
        d1 d1VarN4;
        int length5;
        int iY5;
        int iD5;
        boolean zL3 = L3();
        d3 d3Var = this.f47352j3;
        if (zL3) {
            int i10 = d3Var.f24540u0;
            int i11 = d3Var.f24541v0;
            if (i11 == d3Var.f24544y0 && (d1VarN4 = N4(i10, i11)) != null && (iY5 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length5 = d1VarN4.length()), 0)) < (iD5 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length5, 0))) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (v5.h(d1VarN4.getText(), iY5, iD5)) {
                    v5.n(d1VarN4.getText(), iY5, iD5);
                    d1VarN4.invalidateEffects();
                    g4(i10, i11);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o4();
                }
                d1VarN4.setSelectionOverride(iY5, iD5);
                d1VarN4.makeSelectedDate();
                return;
            }
            return;
        }
        if (y3()) {
            int i12 = d3Var.f24540u0;
            d1 d1VarI2 = I2(i12);
            if (d1VarI2 != null && (iY4 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length4 = d1VarI2.length()), 0)) < (iD4 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length4, 0))) {
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (v5.h(d1VarI2.getText(), iY4, iD4)) {
                    v5.n(d1VarI2.getText(), iY4, iD4);
                    d1VarI2.invalidateEffects();
                    e4(i12);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                d1VarI2.setSelectionOverride(iY4, iD4);
                d1VarI2.makeSelectedDate();
                return;
            }
            return;
        }
        if (w3()) {
            int i13 = d3Var.f24540u0;
            d1 d1VarS2 = s2(i13);
            if (d1VarS2 != null && (iY3 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length3 = d1VarS2.length()), 0)) < (iD3 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length3, 0))) {
                b2 b2Var5 = this.F3;
                if (b2Var5 != null) {
                    b2Var5.d();
                }
                if (v5.h(d1VarS2.getText(), iY3, iD3)) {
                    v5.n(d1VarS2.getText(), iY3, iD3);
                    d1VarS2.invalidateEffects();
                    d4(i13);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    o4();
                }
                d1VarS2.setSelectionOverride(iY3, iD3);
                d1VarS2.makeSelectedDate();
                return;
            }
            return;
        }
        if (!G3()) {
            t5 t5VarG4 = G4();
            if (t5VarG4 != null && (iY = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length = t5VarG4.getEditText().length()), 0)) < (iD = pa.d(d3Var.f24542w0, d3Var.f24545z0, length, 0))) {
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (v5.h(t5VarG4.getEditText().getText(), iY, iD)) {
                    v5.n(t5VarG4.getEditText().getText(), iY, iD);
                    t5VarG4.getEditText().invalidateEffects();
                    t5VarG4.x();
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                t5VarG4.getEditText().setSelectionOverride(iY, iD);
                t5VarG4.getEditText().makeSelectedDate();
                return;
            }
            return;
        }
        int i14 = d3Var.f24540u0;
        d1 d1VarJ4 = j4(i14);
        if (d1VarJ4 != null && (iY2 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length2 = d1VarJ4.length()), 0)) < (iD2 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length2, 0))) {
            b2 b2Var9 = this.F3;
            if (b2Var9 != null) {
                b2Var9.d();
            }
            if (v5.h(d1VarJ4.getText(), iY2, iD2)) {
                v5.n(d1VarJ4.getText(), iY2, iD2);
                d1VarJ4.invalidateEffects();
                f4(i14);
                b2 b2Var10 = this.F3;
                if (b2Var10 != null) {
                    b2Var10.h();
                }
                o4();
            }
            d1VarJ4.setSelectionOverride(iY2, iD2);
            d1VarJ4.makeSelectedDate();
        }
    }

    public final a X4() {
        d3 d3Var;
        int i10;
        a aVarQ2 = Q2();
        return (aVarQ2 == null && (d3Var = this.f47352j3) != null && d3Var.y() && (i10 = d3Var.f24540u0) == d3Var.f24543x0) ? y4(i10) : aVarQ2;
    }

    public final boolean Y1(int i10, int i11) {
        d3 d3Var;
        ArrayList arrayList = this.J3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int iMax = Math.max(0, Math.min(i10, i11));
            int iMax2 = Math.max(0, Math.max(i10, i11));
            int[] iArrO3 = O3(iMax);
            int[] iArrO4 = O3(iMax2);
            a aVar = (a) this.J3.get(iArrO3[0]);
            if (iArrO3[0] == iArrO4[0] || iMax == iMax2) {
                View viewZ1 = z1(aVar);
                if (viewZ1 instanceof t5) {
                    t5 t5Var = (t5) viewZ1;
                    t5Var.B();
                    d1 editText = t5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(iArrO3[1], length), Math.min(iArrO4[1], length));
                }
            } else {
                View viewZ2 = z1(aVar);
                View viewZ3 = z1(this.J3.get(iArrO4[0]));
                if ((viewZ2 instanceof t5) && (viewZ3 instanceof t5)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f47348h3;
                        int size = arrayList2.size();
                        d3Var = this.f47352j3;
                        if (i12 >= size) {
                            break;
                        }
                        d3Var.Y(i12, t5.z(((a) arrayList2.get(i12)).f47028b));
                        i12++;
                    }
                    t5 t5Var2 = (t5) viewZ2;
                    int length2 = t5Var2.getEditText().length();
                    if (iArrO3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!d3Var.k0(t5Var2, 0, iArrO3[1], length2)) {
                        t5Var2.B();
                        return true;
                    }
                    d3Var.c0(0, iArrO4[1], (t5) viewZ3);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Y2(int i10, int i11, int i12, boolean z10) {
        Object obj;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f47348h3;
            a aVar = (a) arrayList2.get(i15);
            boolean z11 = aVar.f47033i;
            ArrayList arrayList3 = aVar.f47035k;
            if (z11) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l10 = (Long) arrayList3.get(i12);
                long jLongValue = l10.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f47035k.size() <= i12 || ((Long) aVar2.f47035k.get(i12)).longValue() != jLongValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> arrayListY2 = Y2(i15, i16, i12 + 1, true);
                if (arrayListY2.isEmpty()) {
                    obj = null;
                } else {
                    TL_iv.RichText textempty = (TL_iv.RichText) this.f47350i3.get(l10);
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                    if (arrayListY2.size() == 1 && (arrayListY2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = arrayListY2.get(0).text != null ? arrayListY2.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = textempty;
                        obj = pageblockblockquote;
                    } else {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = arrayListY2;
                        pageblockblockquoteblocks.caption = textempty;
                        obj = pageblockblockquoteblocks;
                    }
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
                i15 = i16;
            } else if (x3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f47028b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int iP3 = P3(i15);
                pageblockdetails.blocks = Y2(i15 + 1, Math.min(iP3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = iP3 + 1;
            } else {
                int i17 = aVar.f47029c;
                if (i17 <= 0) {
                    J2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    boolean z12 = aVar.d > 0;
                    i13 = i11;
                    i14 = i12;
                    TL_iv.PageBlock pageBlockK2 = k2(i15, i17, i13, i14, z12, iArr);
                    if (pageBlockK2 != null) {
                        arrayList.add(pageBlockK2);
                    }
                    int i18 = iArr[0];
                    i15 = i18 <= 0 ? i13 : i18;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) i0.a.i(1, arrayList))) {
                a9.p.s(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i10) {
        b2 b2Var;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        int length;
        int iY;
        int iD;
        int length2;
        int iY2;
        int iD2;
        int length3;
        int iY3;
        int iD3;
        b2 b2Var2;
        int i12;
        d3 d3Var = this.f47352j3;
        if (d3Var != null && d3Var.y()) {
            boolean zL3 = L3();
            n3 n3Var = this.f47340d3;
            int i13 = 0;
            if (zL3) {
                int i14 = d3Var.f24540u0;
                int i15 = d3Var.f24541v0;
                int i16 = d3Var.f24544y0;
                int i17 = d3Var.f24542w0;
                int i18 = d3Var.f24545z0;
                boolean zK3 = K3(i10, i14, i15, i17, i16, i18);
                int iW2 = !zK3 ? w2(i10) : 0;
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                this.E3 = true;
                int i19 = i15;
                boolean z10 = false;
                while (i19 <= i16) {
                    d1 d1VarN4 = N4(i14, i19);
                    if (d1VarN4 == null) {
                        i12 = i15;
                    } else {
                        int length4 = d1VarN4.length();
                        int iMin = i19 == i15 ? i17 : 0;
                        int iMax = i19 == i16 ? i18 : length4;
                        if (i15 == i16) {
                            iMin = Math.min(i17, i18);
                            iMax = Math.max(i17, i18);
                        }
                        int i20 = iMin;
                        i12 = i15;
                        int iMax2 = Math.max(0, Math.min(i20, length4));
                        int iMax3 = Math.max(0, Math.min(iMax, length4));
                        if (iMax2 < iMax3) {
                            if (zK3) {
                                d1VarN4.removeStyle(i10, iMax2, iMax3);
                            } else {
                                if (iW2 != 0) {
                                    d1VarN4.removeStyle(iW2, iMax2, iMax3);
                                }
                                d1VarN4.addStyle(i10, iMax2, iMax3);
                            }
                            d1VarN4.invalidateEffects();
                            d1VarN4.requestLayout();
                            g4(i14, i19);
                            z10 = true;
                        }
                    }
                    i19++;
                    i15 = i12;
                }
                this.E3 = false;
                if (z10 && (b2Var2 = this.F3) != null) {
                    b2Var2.h();
                }
                n3Var.h0();
                if (z10) {
                    o4();
                }
            } else if (y3()) {
                int i21 = d3Var.f24540u0;
                d1 d1VarI2 = I2(i21);
                if (d1VarI2 != null && (iY3 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length3 = d1VarI2.length()), 0)) < (iD3 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length3, 0))) {
                    boolean z11 = (d1VarI2.getCurrentStyle(iY3, iD3) & i10) == 0;
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.d();
                    }
                    this.E3 = true;
                    if (z11) {
                        int iW3 = w2(i10);
                        if (iW3 != 0) {
                            d1VarI2.removeStyle(iW3, iY3, iD3);
                        }
                        d1VarI2.addStyle(i10, iY3, iD3);
                    } else {
                        d1VarI2.removeStyle(i10, iY3, iD3);
                    }
                    this.E3 = false;
                    e4(i21);
                    d1VarI2.invalidateEffects();
                    d1VarI2.requestLayout();
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.h();
                    }
                    n3Var.h0();
                    o4();
                }
            } else if (w3()) {
                int i22 = d3Var.f24540u0;
                d1 d1VarS2 = s2(i22);
                if (d1VarS2 != null && (iY2 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length2 = d1VarS2.length()), 0)) < (iD2 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length2, 0))) {
                    boolean z12 = (d1VarS2.getCurrentStyle(iY2, iD2) & i10) == 0;
                    int iW4 = z12 ? w2(i10) : 0;
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.d();
                    }
                    this.E3 = true;
                    if (z12) {
                        if (iW4 != 0) {
                            d1VarS2.removeStyle(iW4, iY2, iD2);
                        }
                        d1VarS2.addStyle(i10, iY2, iD2);
                    } else {
                        d1VarS2.removeStyle(i10, iY2, iD2);
                    }
                    d1VarS2.invalidateEffects();
                    d1VarS2.requestLayout();
                    d4(i22);
                    this.E3 = false;
                    b2 b2Var7 = this.F3;
                    if (b2Var7 != null) {
                        b2Var7.h();
                    }
                    n3Var.h0();
                    o4();
                }
            } else if (G3()) {
                int i23 = d3Var.f24540u0;
                d1 d1VarJ4 = j4(i23);
                if (d1VarJ4 != null && (iY = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length = d1VarJ4.length()), 0)) < (iD = pa.d(d3Var.f24542w0, d3Var.f24545z0, length, 0))) {
                    boolean z13 = (d1VarJ4.getCurrentStyle(iY, iD) & i10) == 0;
                    int iW5 = z13 ? w2(i10) : 0;
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.d();
                    }
                    this.E3 = true;
                    if (z13) {
                        if (iW5 != 0) {
                            d1VarJ4.removeStyle(iW5, iY, iD);
                        }
                        d1VarJ4.addStyle(i10, iY, iD);
                    } else {
                        d1VarJ4.removeStyle(i10, iY, iD);
                    }
                    d1VarJ4.invalidateEffects();
                    d1VarJ4.requestLayout();
                    f4(i23);
                    this.E3 = false;
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.h();
                    }
                    n3Var.h0();
                    o4();
                }
            } else {
                int i24 = d3Var.f24540u0;
                int i25 = d3Var.f24543x0;
                int i26 = d3Var.f24542w0;
                int i27 = d3Var.f24545z0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f47357l4.size()) {
                    int i28 = i10;
                    boolean zJ3 = J3(i28, i24, i26, i25, i27);
                    boolean z14 = !zJ3;
                    int iW6 = !zJ3 ? w2(i28) : 0;
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.d();
                    }
                    this.E3 = true;
                    int i29 = i24;
                    boolean z15 = false;
                    while (i29 <= i25) {
                        a aVarY4 = y4(i29);
                        if (aVarY4 != null) {
                            TL_iv.PageBlock pageBlock = aVarY4.f47028b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int iI2 = i2(i29);
                                int i30 = i29 == i24 ? i26 : 0;
                                int i31 = i29 == i25 ? i27 : iI2;
                                int iMax4 = Math.max(i13, Math.min(i30, iI2));
                                int iMax5 = Math.max(i13, Math.min(i31, iI2));
                                if (iMax4 < iMax5) {
                                    t5 t5VarU2 = u2(i29);
                                    if (t5VarU2 != null) {
                                        org.telegram.ui.ActionBar.u4 styleDelegate = t5VarU2.getStyleDelegate();
                                        if (zJ3) {
                                            styleDelegate.removeStyle(i28, iMax4, iMax5);
                                        } else {
                                            if (iW6 != 0) {
                                                styleDelegate.removeStyle(iW6, iMax4, iMax5);
                                            }
                                            styleDelegate.addStyle(i28, iMax4, iMax5);
                                        }
                                        t5VarU2.getEditText().invalidateEffects();
                                        t5VarU2.getEditText().requestLayout();
                                        t5VarU2.x();
                                        iW6 = iW6;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(t5.A(aVarY4.f47028b));
                                        if (zJ3 || iW6 == 0) {
                                            iW6 = iW6;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i11 = iMax4;
                                        } else {
                                            iW6 = iW6;
                                            i11 = iMax4;
                                            v5.o(spannableStringBuilder2, i11, iMax5, iW6, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        v5.o(spannableStringBuilder, i11, iMax5, i28, z14, null);
                                        t5.e(aVarY4.f47028b, spannableStringBuilder);
                                    }
                                    z15 = true;
                                }
                            }
                            z15 = z15;
                        } else {
                            z15 = z15;
                        }
                        i29++;
                        i28 = i10;
                        iW6 = iW6;
                        i13 = 0;
                    }
                    boolean z16 = z15;
                    this.E3 = false;
                    if (z16 && (b2Var = this.F3) != null) {
                        b2Var.h();
                    }
                    n3Var.h0();
                    if (z16) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f10, float f11) {
        TL_iv.pageTableCell pagetablecellM;
        g5 g5Var = this.f47343e4;
        if (!this.f47371x3 || g5Var == null || this.f47367t3 != g5Var || (pagetablecellM = g5Var.m((int) ((f10 - g5Var.getLeft()) - getLeft()), (int) ((f11 - g5Var.getTop()) - getTop()))) == null || pagetablecellM == this.A3) {
            return;
        }
        this.A3 = pagetablecellM;
        g5Var.w(this.f47373z3, pagetablecellM);
    }

    public final ArrayList Z2() {
        return Y2(0, this.f47348h3.size(), 0, false);
    }

    public final void Z3(View view) {
        d1 editText;
        d1 d1Var;
        p3 p3Var;
        o3 o3Var = null;
        if (l2()) {
            boolean zL3 = L3();
            d3 d3Var = this.f47352j3;
            if (zL3) {
                int i10 = d3Var.f24540u0;
                int i11 = d3Var.f24541v0;
                if (i11 == d3Var.f24544y0) {
                    editText = N4(i10, i11);
                    d1Var = editText;
                    if (d1Var == null) {
                        int length = d1Var.length();
                        p3Var = this;
                        o3Var = new o3(p3Var, d1Var, pa.y(d3Var.f24542w0, d3Var.f24545z0, length, 0), pa.d(d3Var.f24542w0, d3Var.f24545z0, length, 0), null);
                    }
                }
            } else {
                if (y3()) {
                    editText = I2(d3Var.f24540u0);
                } else if (w3()) {
                    editText = s2(d3Var.f24540u0);
                } else if (G3()) {
                    editText = j4(d3Var.f24540u0);
                } else {
                    t5 t5VarG4 = G4();
                    if (t5VarG4 != null) {
                        editText = t5VarG4.getEditText();
                    }
                }
                d1Var = editText;
                if (d1Var == null) {
                    int length2 = d1Var.length();
                    p3Var = this;
                    o3Var = new o3(p3Var, d1Var, pa.y(d3Var.f24542w0, d3Var.f24545z0, length2, 0), pa.d(d3Var.f24542w0, d3Var.f24545z0, length2, 0), null);
                }
            }
            p3Var = this;
        } else {
            p3Var = this;
        }
        if (o3Var != null) {
            o3(false);
            p3Var.f47340d3.S1(o3Var, view);
        }
    }

    public final void Z4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                pageblockpreformatted.language = str;
                t5 t5VarU2 = u2(this.f47348h3.indexOf(aVar));
                if (t5VarU2 != null && (aVar2 = t5VarU2.f47487x) != null) {
                    t5VarU2.I(aVar2.f47028b, true);
                    t5VarU2.D = null;
                    t5VarU2.C();
                }
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
            }
        }
    }

    public final void a2() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = this.f47348h3;
            if (i11 >= arrayList6.size()) {
                return;
            }
            a aVar = (a) arrayList6.get(i11);
            ArrayList arrayList7 = aVar.f47034j;
            ArrayList arrayList8 = aVar.f47035k;
            arrayList7.clear();
            if (aVar.f47033i) {
                if (!arrayList.isEmpty()) {
                    a9.p.s(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
            } else {
                for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                    ((Long) arrayList8.get(i12)).getClass();
                    arrayList7.add(new m0());
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    arrayList7.add((m0) arrayList.get(i13));
                }
                int iMax = Math.max(i10, aVar.f47029c);
                if (iMax == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    boolean z10 = aVar.d > 0;
                    while (arrayList2.size() > iMax) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i14 = 1;
                    while (i14 <= iMax) {
                        int i15 = i14 - 1;
                        boolean z11 = i14 == iMax;
                        boolean z12 = i15 < arrayList2.size();
                        if (z12 && z11) {
                            if (((Boolean) arrayList3.get(i15)).booleanValue() != z10) {
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            while (arrayList2.size() > i15) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(m0.a()));
                            arrayList3.add(Boolean.valueOf(z11 ? z10 : false));
                            arrayList4.add(0);
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i15)).getClass();
                        if (z11) {
                            if (((Long) arrayList5.get(i15)).longValue() == 0 || !E3(aVar.f47028b)) {
                                arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                arrayList5.set(i15, Long.valueOf(aVar.f47027a));
                            } else {
                                ((Integer) arrayList4.get(i15)).getClass();
                                ((Long) arrayList5.get(i15)).getClass();
                            }
                            arrayList7.add(new m0());
                        } else {
                            ((Boolean) arrayList3.get(i15)).getClass();
                            arrayList7.add(new m0());
                        }
                        i14++;
                    }
                }
                if (x3(aVar)) {
                    boolean z13 = ((TL_iv.pageBlockDetails) aVar.f47028b).open;
                    m0.a();
                    arrayList.add(new m0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (t5.p(aVar.f47028b)) {
                    m0.a();
                    arrayList7.add(new m0());
                }
            }
            i11++;
            i10 = 0;
        }
    }

    public final boolean a3() {
        ArrayList arrayList = this.f47348h3;
        a aVar = arrayList.isEmpty() ? null : (a) i0.a.i(1, arrayList);
        if (aVar != null && !E3(aVar.f47028b) && !aVar.f47033i && !x3(aVar) && !K2(aVar.f47028b)) {
            if (!(z1(aVar) instanceof t5)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int iY;
        int iD;
        int length2;
        int iY2;
        int iD2;
        int length3;
        int iY3;
        int iD3;
        int length4;
        int iY4;
        int iD4;
        d1 d1VarN4;
        int length5;
        int iY5;
        int iD5;
        boolean zL3 = L3();
        n3 n3Var = this.f47340d3;
        d3 d3Var = this.f47352j3;
        if (zL3) {
            int i10 = d3Var.f24540u0;
            int i11 = d3Var.f24541v0;
            if (i11 == d3Var.f24544y0 && (d1VarN4 = N4(i10, i11)) != null && (iY5 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length5 = d1VarN4.length()), 0)) < (iD5 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length5, 0))) {
                if (v5.h(d1VarN4.getText(), iY5, iD5)) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    v5.n(d1VarN4.getText(), iY5, iD5);
                    d1VarN4.invalidateEffects();
                    g4(i10, i11);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    n3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (v5.g(d1VarN4.getText(), iY5, iD5)) {
                    v5.m(d1VarN4.getText(), iY5, iD5);
                    d1VarN4.invalidateEffects();
                    g4(i10, i11);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                d1VarN4.setSelectionOverride(iY5, iD5);
                o3(false);
                E4(d1VarN4);
                return;
            }
            return;
        }
        if (y3()) {
            int i12 = d3Var.f24540u0;
            d1 d1VarI2 = I2(i12);
            if (d1VarI2 != null && (iY4 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length4 = d1VarI2.length()), 0)) < (iD4 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length4, 0))) {
                if (v5.h(d1VarI2.getText(), iY4, iD4)) {
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.d();
                    }
                    v5.n(d1VarI2.getText(), iY4, iD4);
                    d1VarI2.invalidateEffects();
                    e4(i12);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    n3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (v5.g(d1VarI2.getText(), iY4, iD4)) {
                    v5.m(d1VarI2.getText(), iY4, iD4);
                    d1VarI2.invalidateEffects();
                    e4(i12);
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                d1VarI2.setSelectionOverride(iY4, iD4);
                o3(false);
                E4(d1VarI2);
                return;
            }
            return;
        }
        if (w3()) {
            int i13 = d3Var.f24540u0;
            d1 d1VarS2 = s2(i13);
            if (d1VarS2 != null && (iY3 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length3 = d1VarS2.length()), 0)) < (iD3 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length3, 0))) {
                if (v5.h(d1VarS2.getText(), iY3, iD3)) {
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.d();
                    }
                    v5.n(d1VarS2.getText(), iY3, iD3);
                    d1VarS2.invalidateEffects();
                    d4(i13);
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.h();
                    }
                    n3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var11 = this.F3;
                if (b2Var11 != null) {
                    b2Var11.d();
                }
                if (v5.g(d1VarS2.getText(), iY3, iD3)) {
                    v5.m(d1VarS2.getText(), iY3, iD3);
                    d1VarS2.invalidateEffects();
                    d4(i13);
                    b2 b2Var12 = this.F3;
                    if (b2Var12 != null) {
                        b2Var12.h();
                    }
                    o4();
                }
                d1VarS2.setSelectionOverride(iY3, iD3);
                o3(false);
                E4(d1VarS2);
                return;
            }
            return;
        }
        if (!G3()) {
            t5 t5VarG4 = G4();
            if (t5VarG4 != null && (iY = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length = t5VarG4.getEditText().length()), 0)) < (iD = pa.d(d3Var.f24542w0, d3Var.f24545z0, length, 0))) {
                if (v5.h(t5VarG4.getEditText().getText(), iY, iD)) {
                    b2 b2Var13 = this.F3;
                    if (b2Var13 != null) {
                        b2Var13.d();
                    }
                    v5.n(t5VarG4.getEditText().getText(), iY, iD);
                    t5VarG4.getEditText().invalidateEffects();
                    t5VarG4.x();
                    b2 b2Var14 = this.F3;
                    if (b2Var14 != null) {
                        b2Var14.h();
                    }
                    n3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var15 = this.F3;
                if (b2Var15 != null) {
                    b2Var15.d();
                }
                if (v5.g(t5VarG4.getEditText().getText(), iY, iD)) {
                    v5.m(t5VarG4.getEditText().getText(), iY, iD);
                    t5VarG4.getEditText().invalidateEffects();
                    t5VarG4.x();
                    b2 b2Var16 = this.F3;
                    if (b2Var16 != null) {
                        b2Var16.h();
                    }
                    o4();
                }
                t5VarG4.getEditText().setSelectionOverride(iY, iD);
                o3(false);
                E4(t5VarG4.getEditText());
                return;
            }
            return;
        }
        int i14 = d3Var.f24540u0;
        d1 d1VarJ4 = j4(i14);
        if (d1VarJ4 != null && (iY2 = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length2 = d1VarJ4.length()), 0)) < (iD2 = pa.d(d3Var.f24542w0, d3Var.f24545z0, length2, 0))) {
            if (v5.h(d1VarJ4.getText(), iY2, iD2)) {
                b2 b2Var17 = this.F3;
                if (b2Var17 != null) {
                    b2Var17.d();
                }
                v5.n(d1VarJ4.getText(), iY2, iD2);
                d1VarJ4.invalidateEffects();
                f4(i14);
                b2 b2Var18 = this.F3;
                if (b2Var18 != null) {
                    b2Var18.h();
                }
                n3Var.h0();
                o4();
                return;
            }
            b2 b2Var19 = this.F3;
            if (b2Var19 != null) {
                b2Var19.d();
            }
            if (v5.g(d1VarJ4.getText(), iY2, iD2)) {
                v5.m(d1VarJ4.getText(), iY2, iD2);
                d1VarJ4.invalidateEffects();
                f4(i14);
                b2 b2Var20 = this.F3;
                if (b2Var20 != null) {
                    b2Var20.h();
                }
                o4();
            }
            d1VarJ4.setSelectionOverride(iY2, iD2);
            o3(false);
            E4(d1VarJ4);
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        a aVar = new a(pageblockaudio, 0, 0);
        s sVar = new s();
        aVar.f47032g = sVar;
        sVar.f47416c = true;
        long j10 = document.f22386id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z10) {
            TLRPC.Message message = messageObject.messageOwner;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            s sVar2 = aVar.f47032g;
            sVar2.f47420i = document;
            sVar2.f47417e = str;
            sVar2.f47414a = 1;
            sVar2.f47418f = 0.0f;
        } else {
            sVar.h = document;
            sVar.f47420i = document;
            sVar.f47414a = 2;
            pageblockaudio.audio_id = j10;
        }
        u3(aVar);
        if (z10) {
            s sVar3 = aVar.f47032g;
            String str2 = sVar3.f47417e;
            IdentityHashMap identityHashMap = this.V3;
            s4 s4Var = (s4) identityHashMap.remove(sVar3);
            if (s4Var != null) {
                s4Var.b();
            }
            s4 s4Var2 = new s4(this.f47336b3, str2, document, new a3(aVar, sVar3, this));
            identityHashMap.put(sVar3, s4Var2);
            s4Var2.d();
        }
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        this.f47340d3.onContentChanged();
    }

    public final void b3(a aVar, boolean z10) {
        View viewZ1 = z1(aVar);
        if (!(viewZ1 instanceof y4)) {
            c3(aVar, z10);
            return;
        }
        d1 d1Var = ((y4) viewZ1).f47609r;
        d1Var.r();
        d1Var.setSelection(z10 ? d1Var.length() : 0);
    }

    public final void b4() {
        d1 editText;
        Runnable e2Var;
        int length;
        final int iY;
        final int iD;
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y()) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (L3()) {
            int i12 = d3Var.f24540u0;
            int i13 = d3Var.f24541v0;
            if (i13 != d3Var.f24544y0) {
                return;
            }
            editText = N4(i12, i13);
            e2Var = new j2(this, i12, i13, 1);
        } else if (y3()) {
            int i14 = d3Var.f24540u0;
            editText = I2(i14);
            e2Var = new d2(this, i14, 3);
        } else if (w3()) {
            int i15 = d3Var.f24540u0;
            editText = s2(i15);
            e2Var = new d2(this, i15, i11);
        } else if (G3()) {
            int i16 = d3Var.f24540u0;
            editText = j4(i16);
            e2Var = new d2(this, i16, i10);
        } else {
            t5 t5VarG4 = G4();
            if (t5VarG4 == null) {
                return;
            }
            editText = t5VarG4.getEditText();
            e2Var = new e2(t5VarG4, i11);
        }
        final d1 d1Var = editText;
        final Runnable runnable = e2Var;
        if (d1Var != null && (iY = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length = d1Var.length()), 0)) <= (iD = pa.d(d3Var.f24542w0, d3Var.f24545z0, length, 0))) {
            Editable text = d1Var.getText();
            int i17 = r.h;
            String string = null;
            if (text != null) {
                r[] rVarArr = (r[]) text.getSpans(iY, iD, r.class);
                if (rVarArr.length > 0) {
                    string = rVarArr[0].f47398a;
                }
            }
            if (string == null) {
                string = d1Var.getText().subSequence(iY, iD).toString();
            }
            final float fDp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
            int i18 = g6.G6;
            c6 c6Var = this.f47338c3;
            final int iV0 = g6.v0(i18, c6Var);
            p.U(getContext(), string, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    r rVarA;
                    String str = (String) obj;
                    p3 p3Var = this.f47405a;
                    p3Var.getClass();
                    if (TextUtils.isEmpty(str) || (rVarA = r.a(str, iV0, fDp)) == null) {
                        return;
                    }
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    d3 d3Var2 = p3Var.f47352j3;
                    if (d3Var2 != null) {
                        d3Var2.f(false);
                    }
                    d1 d1Var2 = d1Var;
                    d1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(rVarA, 0, 1, 33);
                    Editable text2 = d1Var2.getText();
                    int iMax = Math.max(0, Math.min(iY, text2.length()));
                    text2.replace(iMax, Math.max(iMax, Math.min(iD, text2.length())), spannableString);
                    runnable.run();
                    b2 b2Var2 = p3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    p3Var.f47340d3.onContentChanged();
                    int iMin = Math.min(iMax + 1, d1Var2.length());
                    d1Var2.r();
                    p3Var.post(new p2(d1Var2, iMin, 3));
                }
            }, c6Var);
        }
    }

    public final void b5(CharSequence charSequence) {
        String string;
        int i10;
        int i11;
        int i12;
        d3 d3Var = this.f47352j3;
        a aVarY4 = y4(d3Var.f24540u0);
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = arrayList.indexOf(aVarY4);
        int iIndexOf2 = arrayList.indexOf(y4(d3Var.f24543x0));
        int i13 = d3Var.f24542w0;
        int i14 = d3Var.f24545z0;
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf >= arrayList.size() || iIndexOf2 >= arrayList.size()) {
            string = null;
        } else {
            try {
                if (iIndexOf > iIndexOf2) {
                    i12 = iIndexOf;
                    i11 = iIndexOf2;
                } else {
                    if (iIndexOf != iIndexOf2 || i13 <= i14) {
                        i10 = i14;
                        i11 = iIndexOf;
                        i12 = iIndexOf2;
                        i14 = i13;
                    } else {
                        i11 = iIndexOf;
                        i12 = iIndexOf2;
                    }
                    HashMap map = this.f47350i3;
                    StringBuilder sb2 = new StringBuilder();
                    o6.c cVar = new o6.c(1);
                    v3.F(sb2, arrayList, new int[]{i11}, i12, i11, i12, i14, i10, cVar, false, 0, map);
                    cVar.b(sb2);
                    string = sb2.toString();
                    if (TextUtils.isEmpty(string)) {
                        string = null;
                    } else {
                        n4.a(A2(i11, i12), z2(i11, i12));
                    }
                }
                HashMap map2 = this.f47350i3;
                StringBuilder sb3 = new StringBuilder();
                o6.c cVar2 = new o6.c(1);
                v3.F(sb3, arrayList, new int[]{i11}, i12, i11, i12, i14, i10, cVar2, false, 0, map2);
                cVar2.b(sb3);
                string = sb3.toString();
                if (TextUtils.isEmpty(string)) {
                    string = null;
                } else {
                    n4.a(A2(i11, i12), z2(i11, i12));
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            i10 = i13;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(string != null ? ClipData.newHtmlText("label", charSequence, string) : ClipData.newPlainText("label", charSequence));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void c2(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f22386id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            String mimeTypeFromExtension = (iLastIndexOf < 0 || (i10 = iLastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i10).toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            tL_document.mime_type = mimeTypeFromExtension;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            d2(tL_document, str);
        }
    }

    public final void c3(a aVar, boolean z10) {
        View viewZ1 = z1(aVar);
        if (!(viewZ1 instanceof g5)) {
            if (z10 && (viewZ1 instanceof t5)) {
                t5 t5Var = (t5) viewZ1;
                if (t5Var.n()) {
                    t5Var.i();
                    return;
                }
            }
            d1 d1VarR3 = R3(viewZ1);
            if (d1VarR3 == null) {
                d3(aVar);
                return;
            }
            d1VarR3.r();
            if (z10) {
                d1VarR3.setSelection(d1VarR3.length());
                return;
            }
            return;
        }
        g5 g5Var = (g5) viewZ1;
        d1 d1Var = g5Var.f47164r;
        x5 x5Var = g5Var.B;
        if (x5Var == null) {
            return;
        }
        if (!z10) {
            d1Var.r();
            d1Var.setSelection(0);
        } else {
            if (x5Var.f47593g.isEmpty()) {
                return;
            }
            j5 j5VarM = g5Var.v.m((TL_iv.pageTableCell) i0.a.i(1, g5Var.B.f47593g));
            if (j5VarM == null) {
                return;
            }
            d1 d1Var2 = j5VarM.f47226a;
            d1Var2.r();
            d1Var2.setSelection(d1Var2.length());
        }
    }

    public final void c4() {
        ClipData primaryClip;
        String htmlText;
        p3 p3Var;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
            return;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (primaryClip.getDescription() == null || !primaryClip.getDescription().hasMimeType("text/html")) {
            htmlText = null;
        } else {
            try {
                htmlText = itemAt.getHtmlText();
            } catch (Exception unused) {
                htmlText = null;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(htmlText);
        d3 d3Var = this.f47352j3;
        if (zIsEmpty) {
            p3Var = this;
        } else {
            try {
                HashMap map = new HashMap();
                ArrayList arrayListW4 = w4(v3.z(htmlText, map));
                if (arrayListW4.isEmpty()) {
                    p3Var = this;
                } else {
                    ArrayList arrayList = this.f47348h3;
                    p3Var = this;
                    try {
                        if (p3Var.I4(arrayList.indexOf(y4(d3Var.f24540u0)), arrayList.indexOf(y4(d3Var.f24543x0)), d3Var.f24542w0, d3Var.f24545z0, arrayListW4)) {
                            if (map.isEmpty()) {
                                return;
                            }
                            p3Var.f47350i3.putAll(map);
                            return;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e10) {
                e = e10;
                p3Var = this;
            }
        }
        CharSequence charSequenceCoerceToText = itemAt.coerceToText(getContext());
        if (charSequenceCoerceToText == null) {
            charSequenceCoerceToText = "";
        }
        p3Var.W1(d3Var.f24540u0, d3Var.f24542w0, d3Var.f24543x0, d3Var.f24545z0, charSequenceCoerceToText.toString().split("\n", -1));
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        a aVar = new a(pageblockdocument, 0, 0);
        s sVar = new s();
        aVar.f47032g = sVar;
        sVar.d = true;
        long j10 = document.f22386id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (!z10) {
            sVar.h = document;
            sVar.f47414a = 2;
            pageblockdocument.document_id = j10;
        } else {
            if (TextUtils.isEmpty(str) || !com.google.android.recaptcha.internal.a.v(str)) {
                return;
            }
            s sVar2 = aVar.f47032g;
            sVar2.h = document;
            sVar2.f47417e = str;
            sVar2.f47414a = 1;
            sVar2.f47418f = 0.0f;
        }
        u3(aVar);
        if (z10) {
            s sVar3 = aVar.f47032g;
            IdentityHashMap identityHashMap = this.V3;
            s4 s4Var = (s4) identityHashMap.remove(sVar3);
            if (s4Var != null) {
                s4Var.b();
            }
            s4 s4Var2 = new s4(this.f47336b3, str, document, new z2(this, sVar3, aVar, str));
            identityHashMap.put(sVar3, s4Var2);
            s4Var2.d();
        }
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        this.f47340d3.onContentChanged();
    }

    public final void d3(a aVar) {
        View viewZ1 = z1(aVar);
        if (viewZ1 instanceof t5) {
            ((t5) viewZ1).B();
        } else if (viewZ1 instanceof q0) {
            ((q0) viewZ1).d.r();
        }
    }

    public final void d4(int i10) {
        KeyEvent.Callback callbackA4 = A4(i10);
        if (callbackA4 instanceof i0) {
            ((i0) callbackA4).b();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        Long l10;
        a aVar;
        View view;
        int i10;
        int i11;
        ArrayList arrayList2;
        float f10;
        boolean z10;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i12 = 0;
            int size = 0;
            while (true) {
                arrayList = this.f47357l4;
                if (i12 >= childCount) {
                    break;
                }
                int iR = RecyclerView.R(getChildAt(i12));
                a aVar2 = (iR < 0 || iR >= arrayList.size()) ? null : (a) arrayList.get(iR);
                if (aVar2 != null) {
                    ArrayList arrayList3 = aVar2.f47035k;
                    if (arrayList3.size() > size) {
                        size = arrayList3.size();
                    }
                }
                i12++;
            }
            if (size != 0) {
                if (this.f47359m4 == null) {
                    gl0 gl0Var = new gl0(this);
                    this.f47359m4 = gl0Var;
                    gl0Var.a(null, null, null, this.f47338c3, 1);
                    z6.a(this.f47359m4, this.f47338c3);
                }
                int i13 = 0;
                while (i13 < size) {
                    float f11 = 0.0f;
                    long jLongValue = 0;
                    float f12 = 0.0f;
                    int i14 = 0;
                    boolean z11 = false;
                    a aVar3 = null;
                    a aVar4 = null;
                    float fMin = 1.0f;
                    while (i14 <= childCount) {
                        if (i14 < childCount) {
                            View childAt = getChildAt(i14);
                            int iR2 = RecyclerView.R(childAt);
                            aVar = (iR2 < 0 || iR2 >= arrayList.size()) ? null : (a) arrayList.get(iR2);
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f47035k;
                                if (i13 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i13);
                                    view = childAt;
                                } else {
                                    view = childAt;
                                    l10 = null;
                                }
                            } else {
                                view = childAt;
                                l10 = null;
                            }
                        } else {
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l10 != null && l10.longValue() == jLongValue)) {
                            i10 = i13;
                            i11 = size;
                            arrayList2 = arrayList;
                            aVar3 = aVar3;
                            aVar4 = aVar4;
                            f10 = fMin;
                        } else {
                            int iK4 = k4(i13, aVar3, true);
                            int iK5 = k4(i13, aVar4, false);
                            if (f12 - f11 <= AndroidUtilities.dp(4.0f)) {
                                i10 = i13;
                                i11 = size;
                                arrayList2 = arrayList;
                            } else {
                                int iDp = AndroidUtilities.dp(16.0f) * i13;
                                i10 = i13;
                                int iDp2 = AndroidUtilities.dp(16.0f) + iDp;
                                i11 = size;
                                arrayList2 = arrayList;
                                int iB = org.telegram.messenger.y1.B(16.0f, getWidth(), iDp);
                                if (iB - iDp2 > AndroidUtilities.dp(8.0f)) {
                                    float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(iDp2, iK4 + f11, iB, f12 - iK5);
                                    this.f47359m4.b(canvas, rectF, fFloor, fFloor, fFloor, fMin);
                                    f10 = fMin;
                                    this.f47359m4.e(canvas, rectF, f10);
                                }
                                z11 = false;
                            }
                            f10 = fMin;
                            z11 = false;
                        }
                        if (view == null || l10 == 0) {
                            aVar3 = aVar3;
                            aVar = aVar4;
                        } else {
                            if (z11) {
                                aVar3 = aVar3;
                                z10 = z11;
                            } else {
                                jLongValue = l10.longValue();
                                f11 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar3 = aVar;
                                z10 = true;
                                f10 = 1.0f;
                            }
                            if (aVar == null || aVar != this.O3) {
                                float y10 = view.getY();
                                float height = view.getHeight() + y10;
                                if (y10 < f11) {
                                    f11 = y10;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                fMin = Math.min(f10, view.getAlpha());
                                z11 = z10;
                            } else {
                                z11 = z10;
                            }
                            i14++;
                            aVar4 = aVar;
                            childCount = childCount;
                            i13 = i10;
                            size = i11;
                            arrayList = arrayList2;
                        }
                        fMin = f10;
                        i14++;
                        aVar4 = aVar;
                        childCount = childCount;
                        i13 = i10;
                        size = i11;
                        arrayList = arrayList2;
                    }
                    i13++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(Uri uri) {
        if (uri == null) {
            return;
        }
        a aVar = this.X3;
        String type = null;
        this.X3 = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            type = context.getContentResolver().getType(uri);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        String str = type;
        boolean zStartsWith = str != null ? str.startsWith("video") : uri.toString().contains("video");
        int i10 = this.f47361n4;
        this.f47361n4 = i10 - 1;
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.r1(this, uri, zStartsWith, str, i10, aVar));
    }

    public final void e3(a aVar) {
        View viewZ1 = z1(aVar);
        if (viewZ1 instanceof t5) {
            t5 t5Var = (t5) viewZ1;
            t5Var.B();
            d1 editText = t5Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (viewZ1 instanceof q0) {
            q0 q0Var = (q0) viewZ1;
            q0Var.d.r();
            d1 editText2 = q0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void e4(int i10) {
        a aVarY4 = y4(i10);
        d1 d1VarI2 = I2(i10);
        if (!x3(aVarY4) || d1VarI2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) aVarY4.f47028b).title = v5.f(d1VarI2.getText());
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
        p3 p3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        boolean zC = o4.c(photoEntry);
        a aVar = new a((photoEntry.isVideo || zC) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.f47032g = T3(photoEntry, str2);
        u3(aVar);
        if (zC) {
            K4(aVar, aVar.f47032g, photoEntry);
            p3Var = this;
        } else {
            p3Var = this;
            p3Var.L4(aVar, aVar.f47032g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.f47340d3.onContentChanged();
    }

    public final void f3(a aVar) {
        View viewZ1 = z1(aVar);
        if (viewZ1 instanceof t5) {
            t5 t5Var = (t5) viewZ1;
            t5Var.B();
            t5Var.getEditText().setSelection(0);
        } else if (viewZ1 instanceof q0) {
            q0 q0Var = (q0) viewZ1;
            q0Var.d.r();
            q0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i10) {
        View viewA4 = A4(i10);
        if (viewA4 instanceof t5) {
            ((t5) viewA4).w();
        }
    }

    public final void g2(g5 g5Var) {
        g5 g5Var2 = this.f47343e4;
        if (g5Var2 != null && g5Var2 != g5Var) {
            LinkedHashSet linkedHashSet = g5Var2.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                g5Var2.v.invalidate();
                g5Var2.t();
            }
        }
        this.f47343e4 = g5Var;
        this.f47372y3 = false;
        this.f47349h4 = -1;
        this.f47347g4 = -1;
        g5Var.setCellSelectionListener(this.f47351i4);
        d3 d3Var = this.f47352j3;
        if (d3Var != null && d3Var.y()) {
            d3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i10, int i11) {
        j5 j5VarM;
        View viewA4 = A4(i10);
        if (viewA4 instanceof g5) {
            g5 g5Var = (g5) viewA4;
            if (i11 == 0) {
                g5Var.u();
                return;
            }
            TL_iv.pageTableCell pagetablecellH = g5Var.h(i11);
            if (pagetablecellH == null || (j5VarM = g5Var.getGrid().m(pagetablecellH)) == null) {
                return;
            }
            x5.d(pagetablecellH, j5VarM.f47226a.getText());
        }
    }

    public d1 getFocusedEditTextOrNull() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof d1) {
            return (d1) viewFindFocus;
        }
        return null;
    }

    public e4 getMapDelegate() {
        return this.Z3;
    }

    public View getOverlayView() {
        return this.f47354k3;
    }

    public j9 getTextSelectionHelper() {
        return this.f47352j3;
    }

    public final g3 h2() {
        int i10;
        int i11;
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y() || G3()) {
            return null;
        }
        a aVarY4 = y4(d3Var.f24540u0);
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = arrayList.indexOf(aVarY4);
        int iIndexOf2 = arrayList.indexOf(y4(d3Var.f24543x0));
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return null;
        }
        if (iIndexOf > iIndexOf2) {
            i11 = iIndexOf;
            i10 = iIndexOf2;
        } else {
            i10 = iIndexOf;
            i11 = iIndexOf2;
        }
        for (int i12 = i10; i12 <= i11; i12++) {
            a aVar = (a) arrayList.get(i12);
            if (aVar.f47033i || x3(aVar)) {
                return null;
            }
        }
        return new g3(this, i10, i11, d3Var.f24542w0, d3Var.f24545z0);
    }

    public final boolean h3(KeyEvent keyEvent) {
        boolean z10;
        d1 d1Var;
        g5 g5VarU2;
        j5 j5VarO;
        g5 g5Var;
        y4 y4Var;
        a row;
        int iIndexOf;
        boolean z11;
        d1 d1VarR3;
        Layout layout;
        int lineForOffset;
        a aVarV1;
        int iT2;
        a aVarV2;
        int iT3;
        t5 t5Var;
        Layout layout2;
        int i10;
        final float primaryHorizontal;
        a aVarU3;
        int i11;
        boolean z12;
        int offsetForHorizontal;
        int i12;
        int iI4;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean zC0;
        int iIndexOf2;
        int length;
        int i17;
        d1 d1VarL;
        Layout layout3;
        int i18;
        int i19;
        int iIndexOf3;
        int i20;
        int i21;
        int iMax;
        a aVarQ2;
        int iIndexOf4;
        boolean z13;
        int i22;
        int unicodeChar;
        boolean z14;
        b2 b2Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean zIsShiftPressed = keyEvent.isShiftPressed();
        boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
        boolean zIsAltPressed = keyEvent.isAltPressed();
        d3 d3Var = this.f47352j3;
        boolean zY = d3Var.y();
        if (zIsCtrlPressed && !zIsAltPressed && (b2Var = this.F3) != null) {
            if (keyCode == 54 && !zIsShiftPressed) {
                b2Var.k();
                return true;
            }
            if ((keyCode == 54 && zIsShiftPressed) || keyCode == 53) {
                b2Var.i();
                return true;
            }
        }
        if (zIsCtrlPressed && !zIsAltPressed) {
            int i23 = 4;
            if (zIsShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode == 44) {
                        i23 = 256;
                    } else if (keyCode == 47 || keyCode == 52) {
                        i23 = 8;
                    } else {
                        i23 = 0;
                    }
                }
                z14 = false;
            } else {
                if (keyCode == 30) {
                    i23 = 1;
                } else if (keyCode != 33) {
                    if (keyCode == 37) {
                        i23 = 2;
                    } else if (keyCode == 39) {
                        i23 = 0;
                        z14 = true;
                    } else if (keyCode != 49) {
                        i23 = 0;
                    } else {
                        i23 = 16;
                    }
                }
                z14 = false;
            }
            if (z14) {
                a4();
                return true;
            }
            if (i23 != 0) {
                Y3(i23);
                return true;
            }
        }
        if (keyCode == 111 && zY) {
            d3Var.f(false);
            return true;
        }
        if (!zY) {
            ArrayList arrayList = this.f47348h3;
            if (zY && zIsShiftPressed && v3(keyCode) && (aVarQ2 = Q2()) != null && (iIndexOf4 = arrayList.indexOf(aVarQ2)) >= 0) {
                View viewZ1 = z1(aVarQ2);
                if (viewZ1 instanceof t5) {
                    t5 t5Var2 = (t5) viewZ1;
                    d1 editText = t5Var2.getEditText();
                    if (editText.getLayout() != null) {
                        int selectionEnd = editText.getSelectionEnd();
                        int length2 = editText.length();
                        switch (keyCode) {
                            case 19:
                            case 21:
                                if (selectionEnd > 0) {
                                    break;
                                } else {
                                    z13 = false;
                                    if (z13) {
                                        i22 = iIndexOf4 + 1;
                                    } else {
                                        i22 = iIndexOf4 - 1;
                                    }
                                    if (i22 >= 0 || i22 >= arrayList.size()) {
                                        break;
                                    } else {
                                        a aVar = (a) arrayList.get(i22);
                                        for (int i24 = 0; i24 < arrayList.size(); i24++) {
                                            d3Var.Y(i24, t5.z(((a) arrayList.get(i24)).f47028b));
                                        }
                                        if (length2 != 0) {
                                            int iMax2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                            if (z13) {
                                                if (iMax2 >= length2) {
                                                    length2--;
                                                }
                                                if (d3Var.k0(t5Var2, 0, iMax2, length2)) {
                                                    KeyEvent.Callback callbackZ1 = z1(aVar);
                                                    if (callbackZ1 instanceof i9) {
                                                        d3Var.c0(0, 0, (i9) callbackZ1);
                                                        return true;
                                                    }
                                                    u0(i22);
                                                    post(new i2(this, aVar, 14));
                                                    return true;
                                                }
                                            } else if (d3Var.k0(t5Var2, 0, iMax2, iMax2 > 0 ? 0 : 1)) {
                                                KeyEvent.Callback callbackZ2 = z1(aVar);
                                                if (callbackZ2 instanceof i9) {
                                                    d3Var.c0(0, callbackZ2 instanceof t5 ? ((t5) callbackZ2).getEditText().length() : 0, (i9) callbackZ2);
                                                    return true;
                                                }
                                                u0(i22);
                                                post(new i2(this, aVar, 15));
                                                return true;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 20:
                            case 22:
                                if (selectionEnd >= length2) {
                                    z13 = true;
                                    if (z13) {
                                        i22 = iIndexOf4 + 1;
                                    } else {
                                        i22 = iIndexOf4 - 1;
                                    }
                                    if (i22 >= 0) {
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
            if (!zY && zIsShiftPressed && v3(keyCode)) {
                boolean z15 = zIsCtrlPressed || zIsAltPressed;
                int i25 = d3Var.G0;
                int i26 = d3Var.I0;
                int i27 = d3Var.H0;
                int i28 = d3Var.f24540u0;
                int i29 = d3Var.f24541v0;
                int i30 = d3Var.f24542w0;
                int i31 = d3Var.f24543x0;
                boolean z16 = z15;
                int i32 = d3Var.f24544y0;
                int i33 = d3Var.f24545z0;
                if (i25 == i28 && i26 == i29 && i27 == i30) {
                    i28 = i31;
                    i29 = i32;
                } else {
                    i33 = i30;
                }
                View viewA4 = A4(i28);
                if (viewA4 == null) {
                    zIsCtrlPressed = zIsCtrlPressed;
                } else {
                    if (viewA4 instanceof g5) {
                        g5 g5Var2 = (g5) viewA4;
                        x5 model = g5Var2.getModel();
                        if (model != null) {
                            ArrayList arrayList2 = model.f47593g;
                            if (arrayList2.isEmpty()) {
                                zIsCtrlPressed = zIsCtrlPressed;
                            } else {
                                int size = arrayList2.size() + 1;
                                int i34 = (i29 < 0 || i29 >= size) ? 0 : i29;
                                d1 d1VarL2 = g5Var2.l(i34);
                                Layout layout4 = d1VarL2 != null ? d1VarL2.getLayout() : null;
                                if (layout4 != null) {
                                    CharSequence text = layout4.getText();
                                    z10 = zIsAltPressed;
                                    int length3 = text.length();
                                    switch (keyCode) {
                                        case 19:
                                            int lineForOffset2 = layout4.getLineForOffset(i33) - 1;
                                            if (lineForOffset2 >= 0) {
                                                length = layout4.getOffsetForHorizontal(lineForOffset2, layout4.getPrimaryHorizontal(i33));
                                            } else if (i34 == 0) {
                                                i18 = i28 - 1;
                                                if (i18 >= 0) {
                                                    length = i4(i18);
                                                    i29 = 0;
                                                } else {
                                                    i18 = i28;
                                                    length = 0;
                                                }
                                            } else {
                                                int i35 = i34 - 1;
                                                if (i35 >= 0 && i35 < arrayList2.size()) {
                                                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i35);
                                                    int iB = model.b(pagetablecell);
                                                    int iA = model.a(pagetablecell);
                                                    int i36 = iB - 1;
                                                    if (i36 >= 0) {
                                                        iIndexOf2 = arrayList2.indexOf(model.d[i36][Math.min(iA, model.f47590c - 1)]);
                                                    }
                                                    if (iIndexOf2 >= 0) {
                                                        i17 = iIndexOf2 + 1;
                                                        d1VarL = g5Var2.l(i17);
                                                        if (d1VarL != null) {
                                                            layout3 = d1VarL.getLayout();
                                                        } else {
                                                            layout3 = null;
                                                        }
                                                        if (layout3 != null) {
                                                            length = layout3.getText().length();
                                                        } else {
                                                            length = 0;
                                                        }
                                                    } else {
                                                        length = g5Var2.getTitleEditText().length();
                                                        i17 = 0;
                                                    }
                                                    i29 = i17;
                                                }
                                                iIndexOf2 = -1;
                                                if (iIndexOf2 >= 0) {
                                                    i17 = iIndexOf2 + 1;
                                                    d1VarL = g5Var2.l(i17);
                                                    if (d1VarL != null) {
                                                        layout3 = d1VarL.getLayout();
                                                    } else {
                                                        layout3 = null;
                                                    }
                                                    if (layout3 != null) {
                                                        length = layout3.getText().length();
                                                    } else {
                                                        length = 0;
                                                    }
                                                } else {
                                                    length = g5Var2.getTitleEditText().length();
                                                    i17 = 0;
                                                }
                                                i29 = i17;
                                            }
                                            i18 = i28;
                                            break;
                                        case 20:
                                            int lineForOffset3 = layout4.getLineForOffset(i33) + 1;
                                            int i37 = length3;
                                            if (lineForOffset3 < layout4.getLineCount()) {
                                                length = layout4.getOffsetForHorizontal(lineForOffset3, layout4.getPrimaryHorizontal(i33));
                                                i18 = i28;
                                            } else {
                                                if (i34 != 0) {
                                                    int i38 = i34 - 1;
                                                    if (i38 < 0 || i38 >= arrayList2.size()) {
                                                        i19 = 1;
                                                    } else {
                                                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i38);
                                                        int iB2 = model.b(pagetablecell2);
                                                        int iA2 = model.a(pagetablecell2);
                                                        i19 = 1;
                                                        int iMax3 = Math.max(1, x5.o(pagetablecell2)) + iB2;
                                                        if (iMax3 < model.f47589b) {
                                                            iIndexOf3 = arrayList2.indexOf(model.d[iMax3][Math.min(iA2, model.f47590c - 1)]);
                                                        }
                                                        if (iIndexOf3 >= 0) {
                                                            i21 = iIndexOf3 + i19;
                                                            i18 = i28;
                                                        } else {
                                                            i20 = i28 + 1;
                                                            if (i20 < arrayList.size()) {
                                                                i18 = i20;
                                                                i21 = 0;
                                                            } else {
                                                                i18 = i28;
                                                                i21 = i29;
                                                            }
                                                            i29 = i21;
                                                        }
                                                        i37 = 0;
                                                        i29 = i21;
                                                    }
                                                    iIndexOf3 = -1;
                                                    if (iIndexOf3 >= 0) {
                                                        i21 = iIndexOf3 + i19;
                                                        i18 = i28;
                                                    } else {
                                                        i20 = i28 + 1;
                                                        if (i20 < arrayList.size()) {
                                                            i18 = i20;
                                                            i21 = 0;
                                                        } else {
                                                            i18 = i28;
                                                            i21 = i29;
                                                        }
                                                        i29 = i21;
                                                    }
                                                    i37 = 0;
                                                    i29 = i21;
                                                } else if (size > 1) {
                                                    i18 = i28;
                                                    length = 0;
                                                    i29 = 1;
                                                } else {
                                                    i18 = i28 + 1;
                                                    if (i18 >= arrayList.size()) {
                                                        i18 = i28;
                                                    }
                                                    length = 0;
                                                    i29 = 0;
                                                }
                                                length = i37;
                                            }
                                            break;
                                        case 21:
                                            if (z16) {
                                                BreakIterator wordInstance = BreakIterator.getWordInstance();
                                                wordInstance.setText(text.toString());
                                                int iPreceding = wordInstance.preceding(Math.max(0, Math.min(i33, text.length())));
                                                iMax = iPreceding == -1 ? 0 : iPreceding;
                                            } else {
                                                iMax = Math.max(0, i33 - 1);
                                            }
                                            if (iMax != i33 || i33 > 0) {
                                                length = iMax;
                                            } else {
                                                int i39 = i34 - 1;
                                                if (i39 >= 0) {
                                                    d1 d1VarL3 = g5Var2.l(i39);
                                                    Layout layout5 = d1VarL3 != null ? d1VarL3.getLayout() : null;
                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                    i29 = i39;
                                                } else {
                                                    int i40 = i28 - 1;
                                                    if (i40 >= 0) {
                                                        i18 = i40;
                                                        length = i4(i40);
                                                        i29 = 0;
                                                    }
                                                    length = iMax;
                                                }
                                            }
                                            i18 = i28;
                                            break;
                                        case 22:
                                            if (z16) {
                                                BreakIterator wordInstance2 = BreakIterator.getWordInstance();
                                                wordInstance2.setText(text.toString());
                                                length = wordInstance2.following(Math.min(i33, text.length()));
                                                if (length == -1) {
                                                    length = text.length();
                                                }
                                            } else {
                                                length = Math.min(length3, i33 + 1);
                                            }
                                            if (length == i33 && i33 >= length3) {
                                                int i41 = i34 + 1;
                                                if (i41 < size) {
                                                    i29 = i41;
                                                    i18 = i28;
                                                    length = 0;
                                                } else {
                                                    i18 = i28 + 1;
                                                    if (i18 < arrayList.size()) {
                                                        length = 0;
                                                        i29 = 0;
                                                    }
                                                }
                                            }
                                            i18 = i28;
                                            break;
                                        default:
                                            length = i33;
                                            i18 = i28;
                                            break;
                                    }
                                    i14 = length;
                                    i15 = i18;
                                    i16 = i29;
                                    i29 = i34;
                                }
                            }
                        } else {
                            zIsCtrlPressed = zIsCtrlPressed;
                        }
                    } else {
                        zIsCtrlPressed = zIsCtrlPressed;
                        z10 = zIsAltPressed;
                        if (viewA4 instanceof t5) {
                            Layout layout6 = ((t5) viewA4).getEditText().getLayout();
                            if (layout6 == null) {
                                zC0 = false;
                            } else {
                                CharSequence text2 = layout6.getText();
                                int length4 = text2.length();
                                switch (keyCode) {
                                    case 19:
                                        int lineForOffset4 = layout6.getLineForOffset(i33) - 1;
                                        if (lineForOffset4 >= 0) {
                                            offsetForHorizontal = layout6.getOffsetForHorizontal(lineForOffset4, layout6.getPrimaryHorizontal(i33));
                                            i13 = i28;
                                        } else {
                                            i12 = i28 - 1;
                                            if (i12 >= 0) {
                                                iI4 = i4(i12);
                                                int i42 = iI4;
                                                i13 = i12;
                                                offsetForHorizontal = i42;
                                            } else {
                                                i13 = i28;
                                                offsetForHorizontal = 0;
                                            }
                                        }
                                        break;
                                    case 20:
                                        int lineForOffset5 = layout6.getLineForOffset(i33) + 1;
                                        if (lineForOffset5 < layout6.getLineCount()) {
                                            offsetForHorizontal = layout6.getOffsetForHorizontal(lineForOffset5, layout6.getPrimaryHorizontal(i33));
                                        } else {
                                            int i43 = i28 + 1;
                                            if (i43 < arrayList.size()) {
                                                i13 = i43;
                                                offsetForHorizontal = 0;
                                            } else {
                                                offsetForHorizontal = length4;
                                            }
                                        }
                                        i13 = i28;
                                        break;
                                    case 21:
                                        if (z16) {
                                            BreakIterator wordInstance3 = BreakIterator.getWordInstance();
                                            wordInstance3.setText(text2.toString());
                                            int iPreceding2 = wordInstance3.preceding(Math.max(0, Math.min(i33, text2.length())));
                                            offsetForHorizontal = iPreceding2 == -1 ? 0 : iPreceding2;
                                        } else {
                                            offsetForHorizontal = Math.max(0, i33 - 1);
                                        }
                                        if (offsetForHorizontal != i33 || i33 > 0 || (i13 = i28 - 1) < 0) {
                                            i13 = i28;
                                        } else {
                                            offsetForHorizontal = i4(i13);
                                        }
                                        break;
                                    case 22:
                                        if (z16) {
                                            BreakIterator wordInstance4 = BreakIterator.getWordInstance();
                                            wordInstance4.setText(text2.toString());
                                            offsetForHorizontal = wordInstance4.following(Math.min(i33, text2.length()));
                                            if (offsetForHorizontal == -1) {
                                                offsetForHorizontal = text2.length();
                                            }
                                        } else {
                                            offsetForHorizontal = Math.min(length4, i33 + 1);
                                        }
                                        if (offsetForHorizontal != i33 || i33 < length4 || (i13 = i28 + 1) >= arrayList.size()) {
                                            i13 = i28;
                                        } else {
                                            offsetForHorizontal = 0;
                                        }
                                        break;
                                    default:
                                        offsetForHorizontal = i33;
                                        i13 = i28;
                                        break;
                                }
                                i14 = offsetForHorizontal;
                                i15 = i13;
                                i16 = i29;
                            }
                            if (!zC0) {
                            }
                        } else {
                            if ((viewA4 instanceof u0) || (viewA4 instanceof m4) || (viewA4 instanceof x) || (viewA4 instanceof g4) || (viewA4 instanceof i4)) {
                                switch (keyCode) {
                                    case 19:
                                    case 21:
                                        i12 = i28 - 1;
                                        if (i12 >= 0) {
                                            iI4 = i4(i12);
                                            int i44 = iI4;
                                            i13 = i12;
                                            offsetForHorizontal = i44;
                                        } else {
                                            offsetForHorizontal = i33;
                                            i13 = i28;
                                        }
                                        break;
                                    case 20:
                                    case 22:
                                        int i45 = i28 + 1;
                                        if (i45 < arrayList.size()) {
                                            i13 = i45;
                                            offsetForHorizontal = 0;
                                        } else {
                                            offsetForHorizontal = i33;
                                            i13 = i28;
                                        }
                                        break;
                                    default:
                                        offsetForHorizontal = i33;
                                        i13 = i28;
                                        break;
                                }
                                i14 = offsetForHorizontal;
                                i15 = i13;
                                i16 = i29;
                            } else {
                                zC0 = false;
                            }
                            if (!zC0) {
                            }
                        }
                    }
                    if (i15 == i28 && i16 == i29 && i14 == i33) {
                        zC0 = true;
                    } else {
                        if (i15 != i28) {
                            u0(i15);
                        }
                        KeyEvent.Callback callbackA4 = A4(i15);
                        if (callbackA4 instanceof i9) {
                            zC0 = d3Var.c0(i16, i14, (i9) callbackA4);
                        } else {
                            post(new lh.c0(this, i15, i16, i14, 2));
                            zC0 = true;
                        }
                    }
                    if (!zC0) {
                    }
                }
                z10 = zIsAltPressed;
                zC0 = false;
                if (!zC0) {
                }
            } else {
                zIsCtrlPressed = zIsCtrlPressed;
                z10 = zIsAltPressed;
            }
            if (!zY && !zIsShiftPressed && !zIsCtrlPressed && !z10 && v3(keyCode)) {
                boolean z17 = keyCode == 22 || keyCode == 20;
                this.f47356l3 = z17 ? d3Var.f24543x0 : d3Var.f24540u0;
                this.f47358m3 = z17 ? d3Var.f24545z0 : d3Var.f24542w0;
                this.f47360n3 = z17 ? d3Var.f24544y0 : d3Var.f24541v0;
                d3Var.f(false);
                return true;
            }
            if (zIsCtrlPressed || keyCode != 29 || (!d3Var.b0() && !S4())) {
                if (zY && !zIsShiftPressed && !zIsCtrlPressed && !z10 && (keyCode == 20 || keyCode == 19)) {
                    boolean z18 = keyCode == 20;
                    int i46 = 0;
                    while (true) {
                        if (i46 < getChildCount()) {
                            View childAt = getChildAt(i46);
                            if (childAt instanceof g5) {
                                g5Var = (g5) childAt;
                                if (g5Var.getTitleEditText().isFocused()) {
                                }
                            }
                            i46++;
                        } else {
                            g5Var = null;
                        }
                    }
                    b51 b51Var = this.U2;
                    if (g5Var != null) {
                        int iIndexOf5 = arrayList.indexOf(g5Var.getRow());
                        if (iIndexOf5 >= 0) {
                            if (!z18) {
                                int iT4 = T2(iIndexOf5 - 1, -1);
                                if (iT4 >= 0) {
                                    post(new i2(this, (a) arrayList.get(iT4), 5));
                                }
                            } else if (!g5Var.r()) {
                                int iT5 = T2(iIndexOf5 + 1, 1);
                                if (iT5 < 0) {
                                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(aVar2);
                                    b51Var.N(false);
                                    post(new i2(this, aVar2, 2));
                                } else {
                                    post(new i2(this, (a) arrayList.get(iT5), 4));
                                }
                            }
                            z12 = true;
                        }
                        z12 = false;
                    } else {
                        int i47 = 0;
                        while (true) {
                            if (i47 < getChildCount()) {
                                View childAt2 = getChildAt(i47);
                                if (childAt2 instanceof y4) {
                                    y4Var = (y4) childAt2;
                                    if (y4Var.f47609r.isFocused()) {
                                    }
                                }
                                i47++;
                            } else {
                                y4Var = null;
                            }
                        }
                        if (y4Var != null) {
                            d1 d1Var2 = y4Var.f47609r;
                            int iIndexOf6 = this.f47357l4.indexOf(y4Var.getRow());
                            if (iIndexOf6 >= 0) {
                                Layout layout7 = d1Var2.getLayout();
                                int lineForOffset6 = layout7 != null ? layout7.getLineForOffset(d1Var2.getSelectionEnd()) : 0;
                                if (z18) {
                                    if (layout7 != null) {
                                        i11 = 1;
                                        if (lineForOffset6 < layout7.getLineCount() - 1) {
                                        }
                                    } else {
                                        i11 = 1;
                                    }
                                    a aVarU4 = U3(iIndexOf6 + i11, i11);
                                    if (aVarU4 == null) {
                                        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                        arrayList.add(aVar3);
                                        b51Var.N(false);
                                        post(new i2(this, aVar3, 6));
                                    } else {
                                        post(new i2(this, aVarU4, 7));
                                    }
                                    z12 = true;
                                } else if ((layout7 == null || lineForOffset6 <= 0) && (aVarU3 = U3(iIndexOf6 - 1, -1)) != null) {
                                    post(new i2(this, aVarU3, 8));
                                    z12 = true;
                                }
                            }
                            z12 = false;
                        } else {
                            int i48 = 0;
                            while (true) {
                                if (i48 < getChildCount()) {
                                    KeyEvent.Callback childAt3 = getChildAt(i48);
                                    if (childAt3 instanceof t5) {
                                        t5 t5Var3 = (t5) childAt3;
                                        if (t5Var3.getEditText().isFocused() || (t5Var3.n() && t5Var3.h.isFocused())) {
                                            row = t5Var3.getRow();
                                        } else {
                                            i48++;
                                        }
                                    } else if (childAt3 instanceof i0) {
                                        i0 i0Var = (i0) childAt3;
                                        if (i0Var.getCaptionEditText().isFocused()) {
                                            row = i0Var.getRow();
                                        } else {
                                            i48++;
                                        }
                                    } else {
                                        if (childAt3 instanceof q0) {
                                            q0 q0Var = (q0) childAt3;
                                            if (q0Var.getEditText().isFocused()) {
                                                row = q0Var.getRow();
                                            }
                                        } else {
                                            continue;
                                        }
                                        i48++;
                                    }
                                } else {
                                    row = null;
                                }
                            }
                            if (row != null && (iIndexOf = arrayList.indexOf(row)) >= 0) {
                                View viewZ2 = z1(row);
                                boolean z19 = viewZ2 instanceof t5;
                                if (z19) {
                                    final t5 t5Var4 = (t5) viewZ2;
                                    d1 d1Var3 = t5Var4.f47482f;
                                    d1 d1Var4 = t5Var4.h;
                                    if (!t5Var4.n()) {
                                        z11 = z18;
                                    } else if (!z18 || d1Var4.isFocused()) {
                                        z11 = z18;
                                        if (!z11 && d1Var4.isFocused() && ((layout2 = t5Var4.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(t5Var4.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                            Layout layout8 = d1Var4.getLayout();
                                            final float primaryHorizontal2 = layout8 == null ? 0.0f : layout8.getPrimaryHorizontal(Math.max(0, Math.min(d1Var4.getSelectionEnd(), d1Var4.length())));
                                            d1Var3.r();
                                            final int i49 = 0;
                                            d1Var3.post(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    switch (i49) {
                                                        case 0:
                                                            d1 d1Var5 = t5Var4.f47482f;
                                                            Layout layout9 = d1Var5.getLayout();
                                                            int length5 = d1Var5.length();
                                                            if (layout9 != null) {
                                                                length5 = layout9.getOffsetForHorizontal(Math.max(0, layout9.getLineCount() - 1), primaryHorizontal2);
                                                            }
                                                            d1Var5.setSelection(Math.max(0, Math.min(length5, d1Var5.length())));
                                                            break;
                                                        default:
                                                            d1 d1Var6 = t5Var4.h;
                                                            Layout layout10 = d1Var6.getLayout();
                                                            int length6 = d1Var6.length();
                                                            if (layout10 != null) {
                                                                length6 = layout10.getOffsetForHorizontal(0, primaryHorizontal2);
                                                            }
                                                            d1Var6.setSelection(Math.max(0, Math.min(length6, d1Var6.length())));
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    } else {
                                        Layout layout9 = t5Var4.getEditText().getLayout();
                                        if (layout9 != null) {
                                            z11 = z18;
                                            if (layout9.getLineForOffset(t5Var4.getEditText().getSelectionEnd()) >= layout9.getLineCount() - 1) {
                                            }
                                        }
                                        Layout layout10 = d1Var3.getLayout();
                                        if (layout10 == null) {
                                            i10 = 0;
                                            primaryHorizontal = 0.0f;
                                        } else {
                                            i10 = 0;
                                            primaryHorizontal = layout10.getPrimaryHorizontal(Math.max(0, Math.min(d1Var3.getSelectionEnd(), d1Var3.length())));
                                        }
                                        if (d1Var4.getVisibility() != 0) {
                                            d1Var4.setVisibility(i10);
                                            t5Var4.requestLayout();
                                        }
                                        d1Var4.r();
                                        final int i50 = 1;
                                        d1Var4.post(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i50) {
                                                    case 0:
                                                        d1 d1Var5 = t5Var4.f47482f;
                                                        Layout layout11 = d1Var5.getLayout();
                                                        int length5 = d1Var5.length();
                                                        if (layout11 != null) {
                                                            length5 = layout11.getOffsetForHorizontal(Math.max(0, layout11.getLineCount() - 1), primaryHorizontal);
                                                        }
                                                        d1Var5.setSelection(Math.max(0, Math.min(length5, d1Var5.length())));
                                                        break;
                                                    default:
                                                        d1 d1Var6 = t5Var4.h;
                                                        Layout layout12 = d1Var6.getLayout();
                                                        int length6 = d1Var6.length();
                                                        if (layout12 != null) {
                                                            length6 = layout12.getOffsetForHorizontal(0, primaryHorizontal);
                                                        }
                                                        d1Var6.setSelection(Math.max(0, Math.min(length6, d1Var6.length())));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (z19) {
                                        t5Var = (t5) viewZ2;
                                        if (t5Var.n() || !t5Var.h.isFocused()) {
                                            d1VarR3 = t5Var.getEditText();
                                        } else {
                                            d1VarR3 = t5Var.getAuthorEditText();
                                        }
                                    } else {
                                        d1VarR3 = R3(viewZ2);
                                    }
                                    if (d1VarR3 != null && (layout = d1VarR3.getLayout()) != null) {
                                        lineForOffset = layout.getLineForOffset(d1VarR3.getSelectionEnd());
                                        if (z11) {
                                            if (lineForOffset < layout.getLineCount() - 1) {
                                                aVarV2 = V1(row, 1);
                                                if (aVarV2 != null) {
                                                    post(new i2(this, aVarV2, 10));
                                                } else {
                                                    iT3 = T2(iIndexOf + 1, 1);
                                                    if (iT3 < 0) {
                                                        a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                        arrayList.add(aVar4);
                                                        b51Var.N(false);
                                                        post(new i2(this, aVar4, 11));
                                                    } else {
                                                        post(new i2(this, (a) arrayList.get(iT3), 12));
                                                    }
                                                }
                                            }
                                        } else if (lineForOffset <= 0) {
                                            aVarV1 = V1(row, -1);
                                            if (aVarV1 != null) {
                                                post(new i2(this, aVarV1, 13));
                                            } else {
                                                iT2 = T2(iIndexOf - 1, -1);
                                                if (iT2 < 0) {
                                                    post(new i2(this, (a) arrayList.get(iT2), 3));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    z11 = z18;
                                    if (z19) {
                                        t5Var = (t5) viewZ2;
                                        if (t5Var.n()) {
                                            d1VarR3 = t5Var.getEditText();
                                        } else {
                                            d1VarR3 = t5Var.getEditText();
                                        }
                                    } else {
                                        d1VarR3 = R3(viewZ2);
                                    }
                                    if (d1VarR3 != null) {
                                        lineForOffset = layout.getLineForOffset(d1VarR3.getSelectionEnd());
                                        if (z11) {
                                            if (lineForOffset < layout.getLineCount() - 1) {
                                                aVarV2 = V1(row, 1);
                                                if (aVarV2 != null) {
                                                    post(new i2(this, aVarV2, 10));
                                                } else {
                                                    iT3 = T2(iIndexOf + 1, 1);
                                                    if (iT3 < 0) {
                                                        a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                        arrayList.add(aVar5);
                                                        b51Var.N(false);
                                                        post(new i2(this, aVar5, 11));
                                                    } else {
                                                        post(new i2(this, (a) arrayList.get(iT3), 12));
                                                    }
                                                }
                                            }
                                        } else if (lineForOffset <= 0) {
                                            aVarV1 = V1(row, -1);
                                            if (aVarV1 != null) {
                                                post(new i2(this, aVarV1, 13));
                                            } else {
                                                iT2 = T2(iIndexOf - 1, -1);
                                                if (iT2 < 0) {
                                                    post(new i2(this, (a) arrayList.get(iT2), 3));
                                                }
                                            }
                                        }
                                    }
                                }
                                z12 = true;
                            }
                            z12 = false;
                        }
                    }
                    if (!z12) {
                        if (zY) {
                            if (keyCode == 61) {
                                return false;
                            }
                            return false;
                        }
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                } else if (zY || zIsCtrlPressed || z10 || keyCode != 61) {
                    if (keyCode == 61 || !zY) {
                        return false;
                    }
                    int i51 = d3Var.f24540u0;
                    int i52 = d3Var.f24543x0;
                    if (i51 >= 0 && i52 >= i51) {
                        if (i51 != i52) {
                            int iIndexOf7 = arrayList.indexOf(y4(i51));
                            int iIndexOf8 = arrayList.indexOf(y4(i52));
                            if (iIndexOf7 < 0 || iIndexOf8 < iIndexOf7) {
                                return true;
                            }
                            m4(iIndexOf7, iIndexOf8, zIsShiftPressed);
                            return true;
                        }
                        a aVarY4 = y4(i51);
                        if (aVarY4 != null) {
                            W3(aVarY4, zIsShiftPressed);
                            return true;
                        }
                    }
                } else {
                    View viewFindFocus = findFocus();
                    if (!(viewFindFocus instanceof d1) || (g5VarU2 = U2((d1Var = (d1) viewFindFocus))) == null || (viewFindFocus != g5VarU2.getTitleEditText() ? (j5VarO = g5VarU2.o(d1Var)) == null || !g5VarU2.s(j5VarO, zIsShiftPressed) : zIsShiftPressed || !g5VarU2.r())) {
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                }
            }
        } else {
            if (!zIsCtrlPressed || zIsShiftPressed || keyCode != 31) {
                if (zIsCtrlPressed && !zIsShiftPressed && keyCode == 52) {
                    CharSequence charSequenceS = d3Var.s();
                    if (charSequenceS != null && charSequenceS.length() > 0) {
                        b5(charSequenceS);
                    }
                    E2();
                    return true;
                }
                if (zIsCtrlPressed && keyCode == 50) {
                    c4();
                    return true;
                }
                if (keyCode == 67 || keyCode == 112) {
                    E2();
                    return true;
                }
                if (keyCode == 66) {
                    t4("\n");
                    return true;
                }
                if (!zIsCtrlPressed && !zIsAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                    t4(String.valueOf((char) unicodeChar));
                    return true;
                }
                ArrayList arrayList3 = this.f47348h3;
                if (zY) {
                }
                if (!zY) {
                    zIsCtrlPressed = zIsCtrlPressed;
                    z10 = zIsAltPressed;
                    if (!zY) {
                    }
                    if (zIsCtrlPressed) {
                        if (zY) {
                            if (zY) {
                                if (keyCode == 61) {
                                    return false;
                                }
                                return false;
                            }
                            if (keyCode == 61) {
                                return false;
                            }
                            return false;
                        }
                        if (zY) {
                            if (keyCode == 61) {
                                return false;
                            }
                            return false;
                        }
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                    if (zY) {
                        if (zY) {
                            if (keyCode == 61) {
                                return false;
                            }
                            return false;
                        }
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                    if (zY) {
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                    if (keyCode == 61) {
                        return false;
                    }
                    return false;
                }
                zIsCtrlPressed = zIsCtrlPressed;
                z10 = zIsAltPressed;
                if (!zY) {
                }
                if (zIsCtrlPressed) {
                    if (zY) {
                        if (zY) {
                            if (keyCode == 61) {
                                return false;
                            }
                            return false;
                        }
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                    if (zY) {
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                    if (keyCode == 61) {
                        return false;
                    }
                    return false;
                }
                if (zY) {
                    if (zY) {
                        if (keyCode == 61) {
                            return false;
                        }
                        return false;
                    }
                    if (keyCode == 61) {
                        return false;
                    }
                    return false;
                }
                if (zY) {
                    if (keyCode == 61) {
                        return false;
                    }
                    return false;
                }
                if (keyCode == 61) {
                    return false;
                }
                return false;
            }
            CharSequence charSequenceS2 = d3Var.s();
            if (charSequenceS2 != null && charSequenceS2.length() != 0) {
                b5(charSequenceS2);
                return true;
            }
        }
        return true;
    }

    public final int i2(int i10) {
        d1 d1VarI2 = I2(i10);
        if (d1VarI2 != null) {
            return d1VarI2.length();
        }
        t5 t5VarU2 = u2(i10);
        if (t5VarU2 != null) {
            return t5VarU2.getEditText().length();
        }
        a aVarY4 = y4(i10);
        if (aVarY4 == null) {
            return 0;
        }
        return t5.z(aVarY4.f47028b).length();
    }

    public final boolean i3(MotionEvent motionEvent) {
        int i10;
        View childAt;
        a row;
        int top;
        g5 g5Var;
        int action = motionEvent.getAction();
        d3 d3Var = this.f47352j3;
        View view = null;
        if (action == 0) {
            this.f47365r3 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f47366s3 = y10;
            this.f47369v3 = false;
            this.f47370w3 = false;
            int i11 = (int) this.f47365r3;
            int top2 = ((int) y10) - getTop();
            g5 g5VarR2 = this.f47343e4;
            if (g5VarR2 == null) {
                g5VarR2 = R2();
            }
            if (g5VarR2 == null || g5VarR2.getParent() != this) {
                for (i10 = 0; i10 < getChildCount(); i10++) {
                    childAt = getChildAt(i10);
                    if (top2 < childAt.getTop() && top2 < childAt.getBottom() && i11 >= childAt.getLeft() && i11 < childAt.getRight()) {
                        view = childAt;
                        break;
                    }
                }
            } else {
                int left = i11 - g5VarR2.getLeft();
                int top3 = top2 - g5VarR2.getTop();
                if (g5VarR2.p(left, top3) >= 0 || g5VarR2.n(left, top3) >= 0) {
                    view = g5VarR2;
                } else {
                    while (i10 < getChildCount()) {
                        childAt = getChildAt(i10);
                        if (top2 < childAt.getTop()) {
                        }
                    }
                }
            }
            this.f47367t3 = view;
            long eventTime = motionEvent.getEventTime();
            boolean z10 = !d3Var.y() && eventTime - this.B3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.f47365r3 - this.C3) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.f47366s3 - this.D3) <= ((float) AndroidUtilities.dp(24.0f));
            this.B3 = eventTime;
            float f10 = this.f47365r3;
            this.C3 = f10;
            float f11 = this.f47366s3;
            this.D3 = f11;
            if (z10 && T4(this.f47367t3, f10, f11)) {
                this.f47370w3 = true;
                this.B3 = 0L;
                org.telegram.ui.Cells.g gVar = d3Var.f25890r0;
                if (!d3Var.y()) {
                    return true;
                }
                d3Var.f25872i = false;
                d3Var.R = false;
                d3Var.f25876k = false;
                v9 v9Var = d3Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                return true;
            }
            if (this.f47367t3 != null) {
                Runnable runnable = this.f47368u3;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                b bVar = new b(this, 2);
                this.f47368u3 = bVar;
                postDelayed(bVar, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.f47368u3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.f47368u3 = null;
                }
                if (this.f47371x3) {
                    Y4(motionEvent.getX(), motionEvent.getY());
                    g5 g5Var2 = this.f47343e4;
                    if (this.f47371x3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.f47371x3 = false;
                    this.f47373z3 = null;
                    this.A3 = null;
                    this.f47372y3 = g5Var2 != null && g5Var2.getSelectedCells().size() > 1;
                    if (g5Var2 != null && !g5Var2.D.isEmpty()) {
                        F4(g5Var2);
                    }
                    this.f47367t3 = null;
                    this.f47370w3 = false;
                    return true;
                }
                if (!this.f47369v3 && !this.f47370w3) {
                    View view2 = this.f47367t3;
                    if (view2 instanceof g5) {
                        g5 g5Var3 = (g5) view2;
                        if (j3(g5Var3, (int) ((motionEvent.getX() - g5Var3.getLeft()) - getLeft()), (int) ((motionEvent.getY() - g5Var3.getTop()) - getTop()))) {
                            this.f47367t3 = null;
                            this.f47370w3 = false;
                            return false;
                        }
                    }
                }
                if (!this.f47369v3 && !this.f47370w3 && (g5Var = this.f47343e4) != null) {
                    View view3 = this.f47367t3;
                    if (view3 == g5Var) {
                        g5 g5Var4 = (g5) view3;
                        TL_iv.pageTableCell pagetablecellM = g5Var4.m((int) ((motionEvent.getX() - g5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - g5Var4.getTop()) - getTop()));
                        if (pagetablecellM != null) {
                            if (this.f47347g4 >= 0 || this.f47349h4 >= 0) {
                                M2();
                            } else {
                                LinkedHashSet linkedHashSet = g5Var4.D;
                                if (!linkedHashSet.remove(pagetablecellM)) {
                                    linkedHashSet.add(pagetablecellM);
                                }
                                g5Var4.v.invalidate();
                                g5Var4.t();
                            }
                        }
                    } else if (view3 != null) {
                        M2();
                    }
                }
                boolean z11 = this.f47369v3;
                b51 b51Var = this.U2;
                ArrayList arrayList = this.f47348h3;
                if (!z11 && !this.f47370w3 && this.f47367t3 == null && !d3Var.y() && this.f47343e4 == null) {
                    float x8 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x8 >= getLeft() && x8 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i12).getBottom() + getTop());
                        }
                        int iB = org.telegram.messenger.y1.B(60.0f, view4.getHeight(), Math.max(Math.max(this.M3, this.K3), this.L3));
                        if (y11 >= paddingTop && y11 <= iB) {
                            a aVar = arrayList.isEmpty() ? null : (a) i0.a.i(1, arrayList);
                            if (aVar == null || !aVar.f47035k.isEmpty() || E3(aVar.f47028b) || aVar.f47033i || x3(aVar) || K2(aVar.f47028b)) {
                                b2 b2Var = this.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                b51Var.N(false);
                                b2 b2Var2 = this.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                post(new i2(this, aVar2, 19));
                            } else {
                                e3(aVar);
                            }
                        }
                    }
                }
                if (!this.f47369v3 && !this.f47370w3 && this.f47367t3 == null && !d3Var.y() && this.f47343e4 == null) {
                    float x10 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    if (this.N3 && x10 >= getLeft() && x10 <= getRight()) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= getChildCount()) {
                                top = Integer.MAX_VALUE;
                                break;
                            }
                            View childAt2 = getChildAt(i13);
                            if (RecyclerView.R(childAt2) == 0) {
                                top = childAt2.getTop() + getTop();
                                break;
                            }
                            i13++;
                        }
                        if (top != Integer.MAX_VALUE) {
                            if (y12 >= AndroidUtilities.dp(60.0f) + getTop() && y12 <= top) {
                                a aVar3 = arrayList.isEmpty() ? null : (a) arrayList.get(0);
                                if (aVar3 == null || E3(aVar3.f47028b) || aVar3.f47033i || x3(aVar3) || K2(aVar3.f47028b)) {
                                    b2 b2Var3 = this.F3;
                                    if (b2Var3 != null) {
                                        b2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    b51Var.N(false);
                                    b2 b2Var4 = this.F3;
                                    if (b2Var4 != null) {
                                        b2Var4.h();
                                    }
                                    post(new i2(this, aVar4, 16));
                                } else {
                                    f3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.f47369v3 && !this.f47370w3 && (this.f47367t3 instanceof i4) && !d3Var.y() && this.f47343e4 == null && (row = ((i4) this.f47367t3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.f47028b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        p.U(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new ib0(23, this, pageblockmath), this.f47338c3);
                    }
                }
                this.f47367t3 = null;
                this.f47370w3 = false;
                return false;
            }
            if (action == 2) {
                if (this.f47371x3 && this.f47367t3 == this.f47343e4) {
                    Y4(motionEvent.getX(), motionEvent.getY());
                    this.f47369v3 = true;
                    return true;
                }
                float x11 = motionEvent.getX() - this.f47365r3;
                float y13 = motionEvent.getY() - this.f47366s3;
                if ((y13 * y13) + (x11 * x11) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                    this.f47369v3 = true;
                    Runnable runnable3 = this.f47368u3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.f47368u3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.f47368u3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.f47368u3 = null;
                }
                if (this.f47371x3) {
                    M2();
                }
                this.f47367t3 = null;
                this.f47370w3 = false;
                return false;
            }
        }
        return false;
    }

    public final int i4(int i10) {
        Layout layout;
        View viewA4 = A4(i10);
        if (!(viewA4 instanceof t5) || (layout = ((t5) viewA4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage j2() {
        if (!k3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> arrayListZ2 = Z2();
        if (arrayListZ2.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = arrayListZ2;
        richMessage.photos = B2();
        richMessage.documents = y2();
        return richMessage;
    }

    public final boolean j3(g5 g5Var, int i10, int i11) {
        x5 x5Var;
        int i12;
        int i13;
        x5 x5Var2;
        TL_iv.pageTableCell pagetablecell;
        x5 x5Var3;
        x5 x5Var4;
        int i14;
        int i15;
        x5 x5Var5;
        TL_iv.pageTableCell pagetablecell2;
        x5 x5Var6;
        int iP = g5Var.p(i10, i11);
        LinkedHashSet linkedHashSet = g5Var.D;
        i5 i5Var = g5Var.v;
        if (iP >= 0) {
            int iR = (i5Var.v() && iP == i5Var.k()) ? i5Var.r() : iP;
            if (g5Var != this.f47343e4 || (x5Var6 = g5Var.B) == null || iP < 0 || iR < iP || iR >= x5Var6.f47589b || linkedHashSet.isEmpty()) {
                g2(g5Var);
                x5Var4 = g5Var.B;
                if (x5Var4 != null && iP >= 0 && iR >= iP && iR < x5Var4.f47589b) {
                    linkedHashSet.clear();
                    for (i14 = iP; i14 <= iR; i14++) {
                        i15 = 0;
                        while (true) {
                            x5Var5 = g5Var.B;
                            if (i15 < x5Var5.f47590c) {
                                pagetablecell2 = x5Var5.d[i14][i15];
                                if (pagetablecell2 != null) {
                                    linkedHashSet.add(pagetablecell2);
                                }
                                i15++;
                            }
                        }
                    }
                    i5Var.invalidate();
                    g5Var.t();
                }
                this.f47347g4 = iP;
            } else {
                int i16 = iP;
                loop0: while (true) {
                    if (i16 <= iR) {
                        int i17 = 0;
                        while (true) {
                            x5 x5Var7 = g5Var.B;
                            if (i17 < x5Var7.f47590c) {
                                if (!linkedHashSet.contains(x5Var7.d[i16][i17])) {
                                    break loop0;
                                }
                                i17++;
                            }
                        }
                        i16++;
                    } else {
                        F4(g5Var);
                    }
                }
                g2(g5Var);
                x5Var4 = g5Var.B;
                if (x5Var4 != null) {
                    linkedHashSet.clear();
                    while (i14 <= iR) {
                        i15 = 0;
                        while (true) {
                            x5Var5 = g5Var.B;
                            if (i15 < x5Var5.f47590c) {
                                pagetablecell2 = x5Var5.d[i14][i15];
                                if (pagetablecell2 != null) {
                                    linkedHashSet.add(pagetablecell2);
                                }
                                i15++;
                            }
                        }
                    }
                    i5Var.invalidate();
                    g5Var.t();
                }
                this.f47347g4 = iP;
            }
            return true;
        }
        int iN = g5Var.n(i10, i11);
        if (iN < 0) {
            return false;
        }
        int iQ = (i5Var.u() && iN == i5Var.j()) ? i5Var.q() : iN;
        if (g5Var != this.f47343e4 || (x5Var3 = g5Var.B) == null || iN < 0 || iQ < iN || iQ >= x5Var3.f47590c || linkedHashSet.isEmpty()) {
            g2(g5Var);
            x5Var = g5Var.B;
            if (x5Var != null && iN >= 0 && iQ >= iN && iQ < x5Var.f47590c) {
                linkedHashSet.clear();
                for (i12 = iN; i12 <= iQ; i12++) {
                    i13 = 0;
                    while (true) {
                        x5Var2 = g5Var.B;
                        if (i13 < x5Var2.f47589b) {
                            pagetablecell = x5Var2.d[i13][i12];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i13++;
                        }
                    }
                }
                i5Var.invalidate();
                g5Var.t();
            }
            this.f47349h4 = iN;
        } else {
            int i18 = iN;
            loop4: while (true) {
                if (i18 <= iQ) {
                    int i19 = 0;
                    while (true) {
                        x5 x5Var8 = g5Var.B;
                        if (i19 < x5Var8.f47589b) {
                            if (!linkedHashSet.contains(x5Var8.d[i19][i18])) {
                                break loop4;
                            }
                            i19++;
                        }
                    }
                    i18++;
                } else {
                    F4(g5Var);
                }
            }
            g2(g5Var);
            x5Var = g5Var.B;
            if (x5Var != null) {
                linkedHashSet.clear();
                while (i12 <= iQ) {
                    i13 = 0;
                    while (true) {
                        x5Var2 = g5Var.B;
                        if (i13 < x5Var2.f47589b) {
                            pagetablecell = x5Var2.d[i13][i12];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i13++;
                        }
                    }
                }
                i5Var.invalidate();
                g5Var.t();
            }
            this.f47349h4 = iN;
        }
        return true;
    }

    public final d1 j4(int i10) {
        View viewA4 = A4(i10);
        if (viewA4 instanceof t5) {
            return ((t5) viewA4).getAuthorEditText();
        }
        return null;
    }

    public final TL_iv.PageBlock k2(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        int i14;
        boolean zE3;
        TL_iv.RichText textempty;
        int i15;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<TL_iv.PageBlock> arrayList3;
        a aVar;
        int i16;
        boolean z11;
        TL_iv.PageBlock pageBlockK2;
        TL_iv.PageBlock pageBlock;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z10 ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z10 ? null : new TL_iv.pageBlockList();
        int i17 = i10;
        int i18 = 1;
        while (i17 < i12) {
            p3 p3Var = this;
            ArrayList arrayList4 = p3Var.f47348h3;
            a aVar2 = (a) arrayList4.get(i17);
            if (aVar2.f47035k.size() > i13 || (i14 = aVar2.f47029c) < i11) {
                break;
            }
            if (i14 == i11) {
                if ((aVar2.d > 0) != z10) {
                    break;
                }
                if (i14 > i11) {
                    break;
                    break;
                }
                zE3 = E3(aVar2.f47028b);
                if (zE3) {
                    textempty = null;
                } else {
                    pageBlock = aVar2.f47028b;
                    if (pageBlock == null) {
                        textempty = null;
                    } else {
                        textempty = pageBlock.text;
                    }
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                }
                i15 = i17 + 1;
                arrayList = new ArrayList();
                if (zE3) {
                    J2(arrayList, aVar2);
                }
                while (true) {
                    if (i15 < i12) {
                        aVar = (a) arrayList4.get(i15);
                        if (aVar.f47035k.size() > i13) {
                            aVar2 = aVar2;
                        } else {
                            aVar2 = aVar2;
                            i16 = aVar.f47029c;
                            if (i16 >= i11) {
                                if (i16 == i11) {
                                    if (aVar.d > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    ArrayList arrayList5 = arrayList;
                                    int[] iArr2 = {i15};
                                    p3 p3Var2 = p3Var;
                                    i15 = i15;
                                    arrayList2 = arrayList5;
                                    pageBlockK2 = p3Var2.k2(i15, i16, i12, i13, z11, iArr2);
                                    if (pageBlockK2 != null) {
                                        arrayList2.add(pageBlockK2);
                                    }
                                    i15 = iArr2[0];
                                    if (i15 <= i15) {
                                        p3Var = this;
                                        i12 = i12;
                                        i13 = i13;
                                        textempty = textempty;
                                        arrayList = arrayList2;
                                    }
                                } else if (!E3(aVar.f47028b)) {
                                    J2(arrayList, aVar);
                                    i15++;
                                }
                            }
                        }
                        textempty = textempty;
                        arrayList2 = arrayList;
                    } else {
                        i15 = i15;
                        aVar2 = aVar2;
                        textempty = textempty;
                        arrayList2 = arrayList;
                    }
                    if (zE3) {
                        arrayList3 = new ArrayList<>();
                        if (!zE3) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = textempty;
                            arrayList3.add(pageblockparagraph);
                        }
                        arrayList3.addAll(arrayList2);
                        if (!arrayList3.isEmpty()) {
                            if (z10) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                                tL_pageListOrderedItemBlocks.num = s3.c.d(i18, ".");
                                tL_pageListOrderedItemBlocks.blocks = arrayList3;
                                tL_pageListOrderedItemBlocks.checkbox = aVar2.f47030e;
                                tL_pageListOrderedItemBlocks.checked = aVar2.f47031f;
                                pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                            } else {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                                tL_pageListItemBlocks.blocks = arrayList3;
                                tL_pageListItemBlocks.checkbox = aVar2.f47030e;
                                tL_pageListItemBlocks.checked = aVar2.f47031f;
                                pageblocklist.items.add(tL_pageListItemBlocks);
                            }
                            i18++;
                        }
                    } else {
                        arrayList3 = new ArrayList<>();
                        if (!zE3) {
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = textempty;
                            arrayList3.add(pageblockparagraph2);
                        }
                        arrayList3.addAll(arrayList2);
                        if (!arrayList3.isEmpty()) {
                            if (z10) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks2 = new TL_iv.TL_pageListOrderedItemBlocks();
                                tL_pageListOrderedItemBlocks2.num = s3.c.d(i18, ".");
                                tL_pageListOrderedItemBlocks2.blocks = arrayList3;
                                tL_pageListOrderedItemBlocks2.checkbox = aVar2.f47030e;
                                tL_pageListOrderedItemBlocks2.checked = aVar2.f47031f;
                                pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks2);
                            } else {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks2 = new TL_iv.TL_pageListItemBlocks();
                                tL_pageListItemBlocks2.blocks = arrayList3;
                                tL_pageListItemBlocks2.checkbox = aVar2.f47030e;
                                tL_pageListItemBlocks2.checked = aVar2.f47031f;
                                pageblocklist.items.add(tL_pageListItemBlocks2);
                            }
                            i18++;
                        }
                    }
                    i17 = i15;
                }
            } else {
                if (i14 > i11) {
                    break;
                }
                zE3 = E3(aVar2.f47028b);
                if (zE3) {
                    pageBlock = aVar2.f47028b;
                    if (pageBlock == null) {
                        textempty = null;
                    } else {
                        textempty = pageBlock.text;
                    }
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                } else {
                    textempty = null;
                }
                i15 = i17 + 1;
                arrayList = new ArrayList();
                if (zE3) {
                    J2(arrayList, aVar2);
                }
                while (true) {
                    if (i15 < i12) {
                        aVar = (a) arrayList4.get(i15);
                        if (aVar.f47035k.size() > i13) {
                            aVar2 = aVar2;
                        } else {
                            aVar2 = aVar2;
                            i16 = aVar.f47029c;
                            if (i16 >= i11) {
                                if (i16 == i11) {
                                    if (aVar.d > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    ArrayList arrayList6 = arrayList;
                                    int[] iArr3 = {i15};
                                    p3 p3Var3 = p3Var;
                                    i15 = i15;
                                    arrayList2 = arrayList6;
                                    pageBlockK2 = p3Var3.k2(i15, i16, i12, i13, z11, iArr3);
                                    if (pageBlockK2 != null) {
                                        arrayList2.add(pageBlockK2);
                                    }
                                    i15 = iArr3[0];
                                    if (i15 <= i15) {
                                        p3Var = this;
                                        i12 = i12;
                                        i13 = i13;
                                        textempty = textempty;
                                        arrayList = arrayList2;
                                    }
                                } else if (!E3(aVar.f47028b)) {
                                    J2(arrayList, aVar);
                                    i15++;
                                }
                            }
                        }
                        textempty = textempty;
                        arrayList2 = arrayList;
                    } else {
                        i15 = i15;
                        aVar2 = aVar2;
                        textempty = textempty;
                        arrayList2 = arrayList;
                    }
                    if (zE3 || !arrayList2.isEmpty()) {
                        arrayList3 = new ArrayList<>();
                        if (!zE3) {
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph3.text = textempty;
                            arrayList3.add(pageblockparagraph3);
                        }
                        arrayList3.addAll(arrayList2);
                        if (!arrayList3.isEmpty()) {
                            if (z10) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks3 = new TL_iv.TL_pageListOrderedItemBlocks();
                                tL_pageListOrderedItemBlocks3.num = s3.c.d(i18, ".");
                                tL_pageListOrderedItemBlocks3.blocks = arrayList3;
                                tL_pageListOrderedItemBlocks3.checkbox = aVar2.f47030e;
                                tL_pageListOrderedItemBlocks3.checked = aVar2.f47031f;
                                pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks3);
                            } else {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks3 = new TL_iv.TL_pageListItemBlocks();
                                tL_pageListItemBlocks3.blocks = arrayList3;
                                tL_pageListItemBlocks3.checkbox = aVar2.f47030e;
                                tL_pageListItemBlocks3.checked = aVar2.f47031f;
                                pageblocklist.items.add(tL_pageListItemBlocks3);
                            }
                        }
                        i17 = i15;
                    } else if (z10) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                        tL_pageListOrderedItemText.num = s3.c.d(i18, ".");
                        tL_pageListOrderedItemText.text = textempty;
                        tL_pageListOrderedItemText.checkbox = aVar2.f47030e;
                        tL_pageListOrderedItemText.checked = aVar2.f47031f;
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    } else {
                        TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                        tL_pageListItemText.text = textempty;
                        tL_pageListItemText.checkbox = aVar2.f47030e;
                        tL_pageListItemText.checked = aVar2.f47031f;
                        pageblocklist.items.add(tL_pageListItemText);
                    }
                    i18++;
                    i17 = i15;
                }
            }
        }
        iArr[0] = i17;
        if (z10) {
            if (!pageblockorderedlist.items.isEmpty()) {
                return pageblockorderedlist;
            }
        } else if (!pageblocklist.items.isEmpty()) {
            return pageblocklist;
        }
        return null;
    }

    public final boolean k3() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageBlock pageBlock2;
        TL_iv.PageBlock pageBlock3;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i10);
            if (t5.z(aVar.f47028b).isEmpty()) {
                if (D3(aVar.f47028b)) {
                    for (s sVar : Q3(aVar)) {
                        if (!sVar.b()) {
                        }
                    }
                    pageBlock = aVar.f47028b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageBlock2 = aVar.f47028b;
                        if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                            int i11 = g4.I;
                            if (((TL_iv.pageBlockMap) pageBlock2).geo instanceof TLRPC.TL_geoPoint) {
                                return true;
                            }
                        }
                        if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                            pageBlock3 = aVar.f47028b;
                            if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                            }
                            i10++;
                        } else {
                            pageBlock3 = aVar.f47028b;
                            if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                            }
                            i10++;
                        }
                    } else {
                        pageBlock2 = aVar.f47028b;
                        if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                            int i12 = g4.I;
                            if (((TL_iv.pageBlockMap) pageBlock2).geo instanceof TLRPC.TL_geoPoint) {
                                return true;
                            }
                        }
                        if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                            pageBlock3 = aVar.f47028b;
                            if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                            }
                            i10++;
                        } else {
                            pageBlock3 = aVar.f47028b;
                            if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                            }
                            i10++;
                        }
                    }
                } else {
                    TL_iv.PageBlock pageBlock4 = aVar.f47028b;
                    if ((pageBlock4 instanceof TL_iv.pageBlockAudio) || (pageBlock4 instanceof TL_iv.pageBlockDocument)) {
                        while (r3.hasNext()) {
                            if (!sVar.b() || sVar.a()) {
                            }
                        }
                        pageBlock = aVar.f47028b;
                        if ((pageBlock instanceof TL_iv.pageBlockMath) || TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock).source)) {
                            pageBlock2 = aVar.f47028b;
                            if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                int i13 = g4.I;
                                if (((TL_iv.pageBlockMap) pageBlock2).geo instanceof TLRPC.TL_geoPoint) {
                                    return true;
                                }
                            }
                            if ((pageBlock2 instanceof TL_iv.pageBlockTable) || !O4((TL_iv.pageBlockTable) pageBlock2)) {
                                pageBlock3 = aVar.f47028b;
                                if ((pageBlock3 instanceof TL_iv.pageBlockButtonRow) || ((TL_iv.pageBlockButtonRow) pageBlock3).buttons.isEmpty()) {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        pageBlock = aVar.f47028b;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageBlock2 = aVar.f47028b;
                            if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                int i14 = g4.I;
                                if (((TL_iv.pageBlockMap) pageBlock2).geo instanceof TLRPC.TL_geoPoint) {
                                    return true;
                                }
                            }
                            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                pageBlock3 = aVar.f47028b;
                                if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                                }
                                i10++;
                            } else {
                                pageBlock3 = aVar.f47028b;
                                if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                                }
                                i10++;
                            }
                        } else {
                            pageBlock2 = aVar.f47028b;
                            if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                int i15 = g4.I;
                                if (((TL_iv.pageBlockMap) pageBlock2).geo instanceof TLRPC.TL_geoPoint) {
                                    return true;
                                }
                            }
                            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                pageBlock3 = aVar.f47028b;
                                if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                                }
                                i10++;
                            } else {
                                pageBlock3 = aVar.f47028b;
                                if (pageBlock3 instanceof TL_iv.pageBlockButtonRow) {
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    public final boolean l2() {
        d1 editText;
        int length;
        int iY;
        int iD;
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y() || d3Var.f24540u0 != d3Var.f24543x0) {
            return false;
        }
        if (L3()) {
            int i10 = d3Var.f24540u0;
            int i11 = d3Var.f24541v0;
            if (i11 != d3Var.f24544y0) {
                return false;
            }
            editText = N4(i10, i11);
        } else if (y3()) {
            editText = I2(d3Var.f24540u0);
        } else if (w3()) {
            editText = s2(d3Var.f24540u0);
        } else if (G3()) {
            editText = j4(d3Var.f24540u0);
        } else {
            t5 t5VarG4 = G4();
            if (t5VarG4 == null) {
                return false;
            }
            editText = t5VarG4.getEditText();
        }
        if (editText == null || (iY = pa.y(d3Var.f24542w0, d3Var.f24545z0, (length = editText.length()), 0)) >= (iD = pa.d(d3Var.f24542w0, d3Var.f24545z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && iY < iD) {
            for (c4 c4Var : (c4[]) text.getSpans(iY, iD, c4.class)) {
                if (text.getSpanStart(c4Var) < iD && text.getSpanEnd(c4Var) > iY) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m2() {
        int[] iArrD4 = D4();
        if (iArrD4 == null) {
            return n2(D2());
        }
        for (int i10 = iArrD4[0]; i10 <= iArrD4[1]; i10++) {
            if (n2((a) this.f47348h3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            Iterator it = Q3((a) arrayList.get(i10)).iterator();
            while (it.hasNext()) {
                if (((s) it.next()).a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean m4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f47348h3;
            if (i11 < arrayList.size()) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (q3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f47029c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f47029c < aVar.f47029c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (q3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    s4();
                    if (findFocus() instanceof d1) {
                        X1();
                    } else {
                        this.U2.N(false);
                    }
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int iIndexOf;
        if (aVar == null || (iIndexOf = (arrayList = this.f47348h3).indexOf(aVar)) < 0 || iIndexOf < 0 || iIndexOf >= arrayList.size()) {
            return false;
        }
        a aVar2 = (a) arrayList.get(iIndexOf);
        if (aVar2.f47029c == 0) {
            TL_iv.PageBlock pageBlock = aVar2.f47028b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(iIndexOf)) {
                return false;
            }
        } else if (iIndexOf <= 0 || ((a) arrayList.get(iIndexOf - 1)).f47029c < aVar2.f47029c) {
            return false;
        }
        return p3(iIndexOf);
    }

    public final void n3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                t5Var.f47482f.hideActionMode();
                t5Var.h.hideActionMode();
            } else if (childAt instanceof g5) {
                g5 g5Var = (g5) childAt;
                i5 i5Var = g5Var.v;
                g5Var.f47164r.hideActionMode();
                for (int i11 = 0; i11 < i5Var.getChildCount(); i11++) {
                    View childAt2 = i5Var.getChildAt(i11);
                    if (childAt2 instanceof j5) {
                        ((j5) childAt2).f47226a.hideActionMode();
                    }
                }
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void n4(a aVar) {
        View viewZ1 = z1(aVar);
        if (viewZ1 instanceof m4) {
            m4 m4Var = (m4) viewZ1;
            ArrayList arrayList = m4Var.f47284y;
            if (m4Var.f47594a == null) {
                return;
            }
            m4Var.n();
            if (m4Var.S >= arrayList.size()) {
                m4Var.S = Math.max(0, arrayList.size() - 1);
            }
            m4Var.o(false);
            m4Var.requestLayout();
            m4Var.invalidate();
        }
    }

    public final boolean o2(int i10) {
        if (i10 <= 0) {
            return false;
        }
        ArrayList arrayList = this.f47348h3;
        return i10 < arrayList.size() && E3(((a) arrayList.get(i10)).f47028b) && ((a) arrayList.get(i10 - 1)).f47029c >= 1;
    }

    public final void o3(boolean z10) {
        d3 d3Var = this.f47352j3;
        if (d3Var != null) {
            if (z10) {
                d3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(d3Var.f25890r0);
                d3Var.v();
            }
        }
        if (z10) {
            V2();
        } else {
            n3();
        }
    }

    public final void o4() {
        post(new b(this, 3));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.I3);
        this.W2 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = this.G3;
        boolean z11 = i15 > 0 && i14 < i15;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View viewFindFocus = findFocus();
            View viewF = viewFindFocus == null ? null : F(viewFindFocus);
            if (viewF != null) {
                int iDp = (AndroidUtilities.dp(8.0f) + viewF.getBottom()) - (i14 - getPaddingBottom());
                if (iDp > 0) {
                    post(new d2(this, iDp, 2));
                }
            }
        }
        this.G3 = i14;
    }

    public final boolean p2() {
        int[] iArrD4 = D4();
        if (iArrD4 == null) {
            return q2(D2());
        }
        for (int i10 = iArrD4[0]; i10 <= iArrD4[1]; i10++) {
            if (q2((a) this.f47348h3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i10) {
        return ((a) this.f47348h3.get(i10)).f47029c + 1 <= MessagesController.getInstance(this.f47336b3).config.richMessageMaxDepth.get() + (-6);
    }

    public final void p4(int i10) {
        ArrayList arrayList = this.f47348h3;
        int iMin = Math.min(arrayList.size() - 1, i10 + 1);
        for (int iMax = Math.max(0, i10 - 1); iMax <= iMin; iMax++) {
            a aVar = (a) arrayList.get(iMax);
            if (aVar.f47029c > 0) {
                View viewZ1 = z1(aVar);
                if (viewZ1 instanceof t5) {
                    ((t5) viewZ1).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int iIndexOf;
        return aVar != null && (iIndexOf = (arrayList = this.f47348h3).indexOf(aVar)) >= 0 && aVar.f47029c > 0 && iIndexOf >= 0 && iIndexOf < arrayList.size() && ((a) arrayList.get(iIndexOf)).f47029c > 0;
    }

    public final boolean q3(int i10, boolean z10, boolean z11) {
        int i11 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f47348h3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar.f47029c > 0) {
                        t2(i10);
                        return true;
                    }
                } else if (aVar.f47029c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.f47028b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || C3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || o2(i10)) && p3(i10)) {
                        a aVar2 = i10 > 0 ? (a) arrayList.get(i10 - 1) : null;
                        if (!z12) {
                            aVar.f47029c = aVar2.f47029c;
                            aVar.d = aVar2.d > 0 ? 1 : 0;
                            aVar.f47030e = false;
                            aVar.f47031f = false;
                            return true;
                        }
                        aVar.f47029c = 1;
                        if (aVar2 != null && aVar2.d > 0) {
                            i11 = 1;
                        }
                        aVar.d = i11;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f47029c >= aVar.f47029c)) && p3(i10)) {
                    aVar.f47029c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void q4(a aVar, s sVar) {
        if (aVar == null) {
            return;
        }
        if (!B3(aVar.f47028b)) {
            r4(aVar);
            return;
        }
        ArrayList arrayListG3 = g3(aVar.f47028b);
        ArrayList arrayList = aVar.h;
        int iIndexOf = arrayList != null ? arrayList.indexOf(sVar) : -1;
        if (iIndexOf >= 0) {
            aVar.h.remove(iIndexOf);
            if (arrayListG3 != null && iIndexOf < arrayListG3.size()) {
                arrayListG3.remove(iIndexOf);
            }
        }
        if (aVar.h.isEmpty()) {
            r4(aVar);
            return;
        }
        int size = aVar.h.size();
        b51 b51Var = this.U2;
        if (size != 1) {
            b51Var.N(true);
            n4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.f47028b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayListG3.get(0);
        aVar.f47028b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.f47032g = (s) aVar.h.get(0);
        aVar.h = null;
        b51Var.N(true);
        n4(aVar);
    }

    public final boolean r2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            return b2Var.f47065e || !b2Var.f47063b.isEmpty();
        }
        return false;
    }

    public final void r3(boolean z10) {
        int i10;
        int i11;
        int[] iArrD4 = D4();
        if (iArrD4 != null && (i10 = iArrD4[0]) != (i11 = iArrD4[1])) {
            m4(i10, i11, z10);
            return;
        }
        a aVarD2 = iArrD4 == null ? D2() : (a) this.f47348h3.get(iArrD4[0]);
        if (aVarD2 != null) {
            W3(aVarD2, z10);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
            this.U2.N(true);
        }
    }

    public final d1 s2(int i10) {
        KeyEvent.Callback callbackA4 = A4(i10);
        if (callbackA4 instanceof i0) {
            return ((i0) callbackA4).getCaptionEditText();
        }
        return null;
    }

    public final void s3(a aVar, ArrayList arrayList, HashMap map, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f47035k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l10 = (Long) arrayList3.get(i11);
            long jLongValue = l10.longValue();
            Integer num = (Integer) map.get(l10);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f47350i3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f47044t = jLongValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f47035k.add((Long) arrayList3.get(i12));
                }
                int i13 = x4.f47587a;
                n41 n41VarJ = n41.J(x4.class);
                n41VarJ.G = aVar2;
                n41VarJ.H = this.f47337b4;
                arrayList2.add(n41VarJ);
                this.f47357l4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.f47029c > 0 && aVar.d > 0 && !E3(aVar.f47028b)) {
                int i11 = aVar.f47029c;
                int i12 = 1;
                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                    a aVar2 = (a) arrayList.get(i13);
                    int i14 = aVar2.f47029c;
                    if (i14 < i11) {
                        break;
                    }
                    if (i14 == i11 && !E3(aVar2.f47028b)) {
                        if (aVar2.d <= 0) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                aVar.d = i12;
            }
            i10++;
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f47344f3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.N3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f47342e3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.J3 = new ArrayList();
        ArrayList arrayList = this.f47348h3;
        W2(arrayList, u4.b(charSequence), this.f47350i3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.J3.add((a) arrayList.get(size));
        }
        this.U2.N(false);
    }

    public final void t2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f47348h3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f47029c;
        if (i12 <= 0) {
            return;
        }
        int i13 = i12 - 1;
        aVar2.f47029c = i13;
        if (i13 == 0) {
            aVar2.d = 0;
            aVar2.f47030e = false;
            aVar2.f47031f = false;
        }
        while (true) {
            i10++;
            if (i10 >= arrayList.size() || (i11 = (aVar = (a) arrayList.get(i10)).f47029c) <= i12) {
                return;
            } else {
                aVar.f47029c = i11 - 1;
            }
        }
    }

    public final void t3() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        a aVar = new a(pageblockdetails, 0, 0);
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar3.f47033i = true;
        a aVarQ2 = Q2();
        ArrayList arrayList = this.f47348h3;
        int iIndexOf = aVarQ2 != null ? arrayList.indexOf(aVarQ2) : -1;
        if (aVarQ2 != null) {
            TL_iv.PageBlock pageBlock = aVarQ2.f47028b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && aVarQ2.f47032g == null && !aVarQ2.f47033i && t5.z(pageBlock).isEmpty()) {
                arrayList.remove(iIndexOf);
            } else if (iIndexOf >= 0) {
                iIndexOf++;
            } else {
                iIndexOf = arrayList.size();
            }
        } else if (iIndexOf >= 0) {
            iIndexOf++;
        } else {
            iIndexOf = arrayList.size();
        }
        arrayList.add(iIndexOf, aVar3);
        arrayList.add(iIndexOf, aVar2);
        arrayList.add(iIndexOf, aVar);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, aVar, 20));
    }

    public final void t4(String str) {
        d3 d3Var = this.f47352j3;
        W1(d3Var.f24540u0, d3Var.f24542w0, d3Var.f24543x0, d3Var.f24545z0, str.split("\n", -1));
    }

    public final t5 u2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View viewM = this.T2.m(i10);
        if (viewM instanceof t5) {
            return (t5) viewM;
        }
        return null;
    }

    public final void u3(a aVar) {
        boolean z10;
        ArrayList arrayList = aVar.f47035k;
        a aVarQ2 = Q2();
        if (aVarQ2 == null) {
            aVarQ2 = this.Y3;
        }
        ArrayList arrayList2 = this.f47348h3;
        int iIndexOf = aVarQ2 != null ? arrayList2.indexOf(aVarQ2) : -1;
        if (iIndexOf < 0 || !(aVarQ2.f47028b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long jA = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVarQ2.f47028b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.f47350i3.put(Long.valueOf(jA), richText);
            }
            aVarQ2.f47035k.add(Long.valueOf(jA));
            aVarQ2.f47028b = new TL_iv.pageBlockParagraph();
            z10 = true;
        }
        boolean z11 = iIndexOf >= 0 && !aVarQ2.f47035k.isEmpty();
        if (z11) {
            arrayList.clear();
            arrayList.addAll(aVarQ2.f47035k);
        }
        if (iIndexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVarQ2.f47028b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && aVarQ2.f47032g == null && t5.z(pageBlock).isEmpty()) {
                arrayList2.set(iIndexOf, aVar);
            } else if (iIndexOf >= 0) {
                arrayList2.add(iIndexOf + 1, aVar);
            } else {
                arrayList2.add(aVar);
            }
        } else if (iIndexOf >= 0) {
            arrayList2.add(iIndexOf + 1, aVar);
        } else {
            arrayList2.add(aVar);
        }
        this.Y3 = aVar;
        int iIndexOf2 = arrayList2.indexOf(aVar);
        if (iIndexOf2 >= arrayList2.size() - 1 || E3(((a) arrayList2.get(iIndexOf2 + 1)).f47028b)) {
            a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            if (z11) {
                aVar2.f47035k.addAll(arrayList);
            }
            arrayList2.add(iIndexOf2 + 1, aVar2);
        }
        this.U2.N(!z10);
        int iIndexOf3 = arrayList2.indexOf(aVar) + 1;
        if (iIndexOf3 <= 0 || iIndexOf3 >= arrayList2.size() || E3(((a) arrayList2.get(iIndexOf3)).f47028b)) {
            return;
        }
        post(new i2(this, (a) arrayList2.get(iIndexOf3), 17));
    }

    public final s u4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document documentS2 = S2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (documentS2 == null) {
                return null;
            }
            s sVar = new s();
            sVar.f47416c = true;
            sVar.f47414a = 2;
            sVar.h = documentS2;
            sVar.f47420i = documentS2;
            return sVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document documentS3 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (documentS3 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.f47414a = 2;
            sVar2.h = documentS3;
            return sVar2;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document documentS4 = S2(pageblockvideo.video_id);
            if (documentS4 == null) {
                return null;
            }
            s sVar3 = new s();
            sVar3.f47415b = true;
            sVar3.f47414a = 2;
            sVar3.h = documentS4;
            sVar3.f47425n = pageblockvideo.spoiler;
            while (i10 < documentS4.attributes.size()) {
                if (documentS4.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentS4.attributes.get(i10);
                    sVar3.f47421j = tL_documentAttributeVideo.f22387w;
                    sVar3.f47422k = tL_documentAttributeVideo.h;
                    return sVar3;
                }
                i10++;
            }
            return sVar3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        long j10 = pageblockphoto.photo_id;
        if (j10 != 0) {
            int i11 = 0;
            loop1: while (true) {
                if (i11 >= this.f47348h3.size()) {
                    TL_iv.RichMessage richMessage = this.f47346g3;
                    if (richMessage != null && (arrayList = richMessage.photos) != null) {
                        int size = arrayList.size();
                        while (true) {
                            if (i10 >= size) {
                                HashMap map = n4.f47299a;
                                synchronized (n4.class) {
                                    if (j10 == 0) {
                                        photo = null;
                                    } else {
                                        photo = (TLRPC.Photo) n4.f47299a.get(Long.valueOf(j10));
                                    }
                                    break;
                                }
                            }
                            TLRPC.Photo photo2 = arrayList.get(i10);
                            i10++;
                            photo = photo2;
                            if (photo != null && photo.f22404id == j10) {
                                break;
                            }
                        }
                    } else {
                        HashMap map2 = n4.f47299a;
                        synchronized (n4.class) {
                            if (j10 == 0) {
                                photo = null;
                            } else {
                                photo = (TLRPC.Photo) n4.f47299a.get(Long.valueOf(j10));
                            }
                            break;
                        }
                    }
                } else {
                    for (s sVar4 : Q3((a) this.f47348h3.get(i11))) {
                        if (sVar4 != null && (photo = sVar4.f47419g) != null && photo.f22404id == j10) {
                            break loop1;
                        }
                    }
                    i11++;
                }
            }
        } else {
            photo = null;
        }
        if (photo == null) {
            return null;
        }
        s sVar5 = new s();
        sVar5.f47414a = 2;
        sVar5.f47419g = photo;
        sVar5.f47425n = pageblockphoto.spoiler;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            sVar5.f47421j = closestPhotoSizeWithSize.f22405w;
            sVar5.f47422k = closestPhotoSizeWithSize.h;
        }
        return sVar5;
    }

    public final void v2() {
        G2();
        this.f47346g3 = null;
        this.X3 = null;
        this.Y3 = null;
        this.F3 = new b2(this.f47355k4);
        z4();
        this.F3.j();
        n3 n3Var = this.f47340d3;
        if (n3Var != null) {
            n3Var.J1();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f47346g3 == null || aVar == null || (pageBlock = aVar.f47028b) == null) {
            return;
        }
        if (!B3(pageBlock)) {
            s sVarU4 = u4(aVar.f47028b);
            if (sVarU4 != null) {
                aVar.f47032g = sVarU4;
                return;
            }
            return;
        }
        ArrayList arrayListG3 = g3(aVar.f47028b);
        aVar.h = new ArrayList();
        if (arrayListG3 != null) {
            for (int i10 = 0; i10 < arrayListG3.size(); i10++) {
                s sVarU5 = u4((TL_iv.PageBlock) arrayListG3.get(i10));
                ArrayList arrayList = aVar.h;
                if (sVarU5 == null) {
                    sVarU5 = new s();
                }
                arrayList.add(sVarU5);
            }
        }
    }

    public final boolean w3() {
        int i10;
        d3 d3Var = this.f47352j3;
        if (d3Var == null || !d3Var.y() || (i10 = d3Var.f24540u0) != d3Var.f24543x0 || i10 < 0 || i10 >= this.f47357l4.size()) {
            return false;
        }
        return A4(i10) instanceof i0;
    }

    public final ArrayList w4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (B3(aVar.f47028b)) {
                ArrayList arrayListG3 = g3(aVar.f47028b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (arrayListG3 != null) {
                    int size2 = arrayListG3.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayListG3.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s sVarU4 = u4(pageBlock);
                        if (sVarU4 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(sVarU4);
                        }
                    }
                    arrayListG3.clear();
                    arrayListG3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f47028b;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    s sVarU5 = u4(pageBlock2);
                    if (sVarU5 != null) {
                        aVar.f47032g = sVarU5;
                        arrayList2.add(aVar);
                    }
                } else {
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }

    public final boolean x2() {
        ArrayList arrayList;
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f47348h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f47033i;
            ArrayList arrayList2 = aVar.f47035k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.EL.merge(map, (Long) arrayList2.get(i11), 1, new q2());
                }
            }
            i10++;
        }
        boolean z11 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.f47035k;
            if (arrayList3.size() == 1 && (aVar2.f47028b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) map.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText textempty = aVar2.f47028b.text;
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = textempty;
                    TL_iv.RichText textempty2 = (TL_iv.RichText) this.f47350i3.remove(l10);
                    if (textempty2 == null) {
                        textempty2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = textempty2;
                    aVar2.f47028b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void x4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof d4) {
                y yVar = (y) ((d4) childAt);
                yVar.f47595b.a(yVar.f47594a, new lh.p(yVar, 20));
            }
        }
        invalidate();
    }

    public final ArrayList y2() {
        TLRPC.Document document;
        s sVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47348h3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i10);
            if ((aVar.f47028b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.f47032g) != null && sVar.b() && (document2 = aVar.f47032g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.f47028b).document_id = document2.f22386id;
            }
            for (s sVar2 : Q3(aVar)) {
                if (sVar2.b() && (document = sVar2.h) != null) {
                    long j10 = document.f22386id;
                    if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                        arrayList.add(sVar2.h);
                    }
                }
            }
            i10++;
        }
    }

    public final boolean y3() {
        int i10;
        d3 d3Var = this.f47352j3;
        return d3Var != null && d3Var.y() && (i10 = d3Var.f24540u0) == d3Var.f24543x0 && x3(y4(i10));
    }

    public final a y4(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f47357l4;
        if (i10 < arrayList.size()) {
            return (a) arrayList.get(i10);
        }
        return null;
    }

    public final ArrayList z2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f47348h3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.f22386id))) {
                    arrayList.add(sVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.f47348h3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.U2.N(false);
    }
}
