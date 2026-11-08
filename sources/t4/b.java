package t4;

import a0.l;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
public final class b {
    public static final c5.b f55424f = new c5.b(7);
    public static final c f55425g = new Object();
    public final Object f55426a;
    public final Object f55427b;
    public final Object f55428c;
    public final Cloneable d;
    public final Object f55429e;

    public b(int[] iArr, int i7, c[] cVarArr) {
        a aVar;
        this.f55429e = new float[3];
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f55427b = iArr2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            int b10 = b(Color.blue(i11), 8, 5) | (b(Color.red(i11), 8, 5) << 10) | (b(Color.green(i11), 8, 5) << 5);
            iArr[i10] = b10;
            iArr2[b10] = iArr2[b10] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0) {
                int rgb = Color.rgb(b((i13 >> 10) & 31, 5, 8), b((i13 >> 5) & 31, 5, 8), b(i13 & 31, 5, 8));
                float[] fArr = (float[]) this.f55429e;
                ThreadLocal threadLocal = i0.a.f15118a;
                i0.a.c(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (c(fArr)) {
                    iArr2[i13] = 0;
                }
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f55426a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 <= i7) {
            this.f55428c = new ArrayList();
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = iArr3[i16];
                ((ArrayList) this.f55428c).add(new d(Color.rgb(b((i17 >> 10) & 31, 5, 8), b((i17 >> 5) & 31, 5, 8), b(i17 & 31, 5, 8)), iArr2[i17]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i7, f55424f);
        priorityQueue.offer(new a(this, 0, ((int[]) this.f55426a).length - 1));
        while (priorityQueue.size() < i7 && (aVar = (a) priorityQueue.poll()) != null) {
            int i18 = aVar.f55417b;
            int i19 = aVar.f55416a;
            if ((i18 + 1) - i19 <= 1) {
                break;
            }
            b bVar = aVar.f55423j;
            if ((i18 + 1) - i19 > 1) {
                int i20 = aVar.f55419e - aVar.d;
                int i21 = aVar.f55421g - aVar.f55420f;
                int i22 = aVar.f55422i - aVar.h;
                int i23 = (i20 < i21 || i20 < i22) ? (i21 < i20 || i21 < i22) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) bVar.f55426a;
                int[] iArr5 = (int[]) bVar.f55427b;
                a(i23, i19, i18, iArr4);
                Arrays.sort(iArr4, i19, aVar.f55417b + 1);
                a(i23, i19, aVar.f55417b, iArr4);
                int i24 = aVar.f55418c / 2;
                int i25 = 0;
                int i26 = i19;
                while (true) {
                    int i27 = aVar.f55417b;
                    if (i26 > i27) {
                        break;
                    }
                    i25 += iArr5[iArr4[i26]];
                    if (i25 >= i24) {
                        i19 = Math.min(i27 - 1, i26);
                        break;
                    }
                    i26++;
                }
                a aVar2 = new a(bVar, i19 + 1, aVar.f55417b);
                aVar.f55417b = i19;
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
            b bVar2 = aVar3.f55423j;
            int[] iArr6 = (int[]) bVar2.f55426a;
            int[] iArr7 = (int[]) bVar2.f55427b;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = aVar3.f55416a; i32 <= aVar3.f55417b; i32++) {
                int i33 = iArr6[i32];
                int i34 = iArr7[i33];
                i29 += i34;
                i28 = (((i33 >> 10) & 31) * i34) + i28;
                i30 = (((i33 >> 5) & 31) * i34) + i30;
                i31 += i34 * (i33 & 31);
            }
            float f10 = i29;
            d dVar = new d(Color.rgb(b(Math.round(i28 / f10), 5, 8), b(Math.round(i30 / f10), 5, 8), b(Math.round(i31 / f10), 5, 8)), i29);
            if (!c(dVar.b())) {
                arrayList.add(dVar);
            }
        }
        this.f55428c = arrayList;
    }

    public static void a(int i7, int i10, int i11, int[] iArr) {
        if (i7 != -2) {
            if (i7 == -1) {
                while (i10 <= i11) {
                    int i12 = iArr[i10];
                    iArr[i10] = ((i12 >> 10) & 31) | ((i12 & 31) << 10) | (((i12 >> 5) & 31) << 5);
                    i10++;
                }
                return;
            }
            return;
        }
        while (i10 <= i11) {
            int i13 = iArr[i10];
            iArr[i10] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
            i10++;
        }
    }

    public static int b(int i7, int i10, int i11) {
        int i12;
        if (i11 > i10) {
            i12 = i7 << (i11 - i10);
        } else {
            i12 = i7 >> (i10 - i11);
        }
        return i12 & ((1 << i11) - 1);
    }

    public boolean c(float[] fArr) {
        c[] cVarArr = (c[]) this.d;
        if (cVarArr != null && cVarArr.length > 0) {
            for (c cVar : cVarArr) {
                cVar.getClass();
                float f10 = fArr[2];
                if (f10 < 0.95f && f10 > 0.05f) {
                    float f11 = fArr[0];
                    if (f11 < 10.0f || f11 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public b(ArrayList arrayList, List list) {
        this.f55426a = list;
        this.f55427b = arrayList;
        this.d = new SparseBooleanArray();
        this.f55428c = new l(0);
        int size = list.size();
        int i7 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = (d) list.get(i10);
            int i11 = dVar2.f55433e;
            if (i11 > i7) {
                dVar = dVar2;
                i7 = i11;
            }
        }
        this.f55429e = dVar;
    }
}
