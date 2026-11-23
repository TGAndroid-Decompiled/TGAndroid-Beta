package t1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import c8.mc;
public final class g extends mc {
    public final TextView f57654a;
    public final e f57655b;
    public boolean f57656c = true;

    public g(TextView textView) {
        this.f57654a = textView;
        this.f57655b = new e(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f57656c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof e) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            e eVar = this.f57655b;
            if (i12 < length2) {
                if (inputFilterArr[i12] == eVar) {
                    return inputFilterArr;
                }
                i12++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
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
        this.f57656c = z10;
        d();
        TextView textView = this.f57654a;
        textView.setFilters(a(textView.getFilters()));
    }

    public final void d() {
        TextView textView = this.f57654a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f57656c) {
            if (!(transformationMethod instanceof k) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new k(transformationMethod);
            }
        } else if (transformationMethod instanceof k) {
            transformationMethod = ((k) transformationMethod).f57662a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
