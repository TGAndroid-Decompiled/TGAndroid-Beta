package q1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import i7.v6;
public final class f extends v6 {
    public final TextView f46207a;
    public final d f46208b;
    public boolean f46209c = true;

    public f(TextView textView) {
        this.f46207a = textView;
        this.f46208b = new d(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f46209c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f46208b;
            if (i13 < length2) {
                if (inputFilterArr[i13] == dVar) {
                    return inputFilterArr;
                }
                i13++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }

    @Override
    public final void b(boolean z10) {
        if (z10) {
            d();
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f46209c = z10;
        d();
        TextView textView = this.f46207a;
        textView.setFilters(a(textView.getFilters()));
    }

    public final void d() {
        TextView textView = this.f46207a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f46209c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f46215a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
