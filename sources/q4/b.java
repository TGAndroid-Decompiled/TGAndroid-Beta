package q4;

import a0.l;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import fb.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
public final class b {
    public static final i f44205f = new i(3);
    public static final c f44206g = new Object();
    public final Object f44207a;
    public final Object f44208b;
    public final Object f44209c;
    public final Cloneable d;
    public final Object f44210e;

    public b(int[] iArr, int i10, c[] cVarArr) {
        a aVar;
        this.f44210e = new float[3];
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f44208b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int b10 = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = b10;
            iArr2[b10] = iArr2[b10] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                int rgb = Color.rgb(b((i14 >> 10) & 31, 5, 8), b((i14 >> 5) & 31, 5, 8), b(i14 & 31, 5, 8));
                float[] fArr = (float[]) this.f44210e;
                ThreadLocal threadLocal = i0.a.f11448a;
                i0.a.b(fArr, Color.red(rgb), Color.green(rgb), Color.blue(rgb));
                if (c(fArr)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f44207a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i10) {
            this.f44209c = new ArrayList();
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = iArr3[i17];
                ((ArrayList) this.f44209c).add(new d(Color.rgb(b((i18 >> 10) & 31, 5, 8), b((i18 >> 5) & 31, 5, 8), b(i18 & 31, 5, 8)), iArr2[i18]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i10, f44205f);
        priorityQueue.offer(new a(this, 0, ((int[]) this.f44207a).length - 1));
        while (priorityQueue.size() < i10 && (aVar = (a) priorityQueue.poll()) != null) {
            int i19 = aVar.f44198b;
            int i20 = aVar.f44197a;
            if ((i19 + 1) - i20 <= 1) {
                break;
            }
            b bVar = aVar.f44204j;
            if ((i19 + 1) - i20 > 1) {
                int i21 = aVar.f44200e - aVar.d;
                int i22 = aVar.f44202g - aVar.f44201f;
                int i23 = aVar.f44203i - aVar.h;
                int i24 = (i21 < i22 || i21 < i23) ? (i22 < i21 || i22 < i23) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) bVar.f44207a;
                int[] iArr5 = (int[]) bVar.f44208b;
                a(i24, i20, i19, iArr4);
                Arrays.sort(iArr4, i20, aVar.f44198b + 1);
                a(i24, i20, aVar.f44198b, iArr4);
                int i25 = aVar.f44199c / 2;
                int i26 = i20;
                int i27 = 0;
                while (true) {
                    int i28 = aVar.f44198b;
                    if (i26 > i28) {
                        break;
                    }
                    i27 += iArr5[iArr4[i26]];
                    if (i27 >= i25) {
                        i20 = Math.min(i28 - 1, i26);
                        break;
                    }
                    i26++;
                }
                a aVar2 = new a(bVar, i20 + 1, aVar.f44198b);
                aVar.f44198b = i20;
                aVar.a();
                priorityQueue.offer(aVar2);
                priorityQueue.offer(aVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            b bVar2 = aVar3.f44204j;
            int[] iArr6 = (int[]) bVar2.f44207a;
            int[] iArr7 = (int[]) bVar2.f44208b;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            for (int i33 = aVar3.f44197a; i33 <= aVar3.f44198b; i33++) {
                int i34 = iArr6[i33];
                int i35 = iArr7[i34];
                i30 += i35;
                i29 = (((i34 >> 10) & 31) * i35) + i29;
                i31 = (((i34 >> 5) & 31) * i35) + i31;
                i32 += i35 * (i34 & 31);
            }
            float f7 = i30;
            d dVar = new d(Color.rgb(b(Math.round(i29 / f7), 5, 8), b(Math.round(i31 / f7), 5, 8), b(Math.round(i32 / f7), 5, 8)), i30);
            if (!c(dVar.b())) {
                arrayList.add(dVar);
            }
        }
        this.f44209c = arrayList;
    }

    public static void a(int i10, int i11, int i12, int[] iArr) {
        if (i10 != -2) {
            if (i10 == -1) {
                while (i11 <= i12) {
                    int i13 = iArr[i11];
                    iArr[i11] = ((i13 >> 10) & 31) | ((i13 & 31) << 10) | (((i13 >> 5) & 31) << 5);
                    i11++;
                }
                return;
            }
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = (i14 & 31) | (((i14 >> 5) & 31) << 10) | (((i14 >> 10) & 31) << 5);
            i11++;
        }
    }

    public static int b(int i10, int i11, int i12) {
        int i13;
        if (i12 > i11) {
            i13 = i10 << (i12 - i11);
        } else {
            i13 = i10 >> (i11 - i12);
        }
        return i13 & ((1 << i12) - 1);
    }

    public boolean c(float[] fArr) {
        c[] cVarArr = (c[]) this.d;
        if (cVarArr != null && cVarArr.length > 0) {
            for (c cVar : cVarArr) {
                cVar.getClass();
                float f7 = fArr[2];
                if (f7 < 0.95f && f7 > 0.05f) {
                    float f10 = fArr[0];
                    if (f10 < 10.0f || f10 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public b(ArrayList arrayList, List list) {
        this.f44207a = list;
        this.f44208b = arrayList;
        this.d = new SparseBooleanArray();
        this.f44209c = new l(0);
        int size = list.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = (d) list.get(i11);
            int i12 = dVar2.f44214e;
            if (i12 > i10) {
                dVar = dVar2;
                i10 = i12;
            }
        }
        this.f44210e = dVar;
    }
}
