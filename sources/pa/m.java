package pa;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
public final class m extends i {
    public final Serializable f41112a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f41112a = bool;
    }

    public static boolean s(m mVar) {
        Serializable serializable = mVar.f41112a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        BigDecimal i10;
        BigDecimal i11;
        if (this != obj) {
            if (obj != null && m.class == obj.getClass()) {
                m mVar = (m) obj;
                Serializable serializable = mVar.f41112a;
                Serializable serializable2 = this.f41112a;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (s(this) && s(mVar)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (r().longValue() == mVar.r().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return o().equals(mVar.o());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            i10 = (BigDecimal) serializable2;
                        } else {
                            i10 = ra.d.i(n());
                        }
                        if (serializable instanceof BigDecimal) {
                            i11 = (BigDecimal) serializable;
                        } else {
                            i11 = ra.d.i(mVar.n());
                        }
                        if (i10.compareTo(i11) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double q10 = q();
                    double q11 = mVar.q();
                    if (q10 != q11) {
                        if (Double.isNaN(q10) && Double.isNaN(q11)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                } else {
                    return serializable2.equals(serializable);
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f41112a;
        if (serializable == null) {
            return 31;
        }
        if (s(this)) {
            doubleToLongBits = r().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override
    public final String n() {
        Serializable serializable = this.f41112a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return r().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger o() {
        Serializable serializable = this.f41112a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (s(this)) {
            return BigInteger.valueOf(r().longValue());
        }
        String n10 = n();
        ra.d.d(n10);
        return new BigInteger(n10);
    }

    public final boolean p() {
        Serializable serializable = this.f41112a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(n());
    }

    public final double q() {
        if (this.f41112a instanceof Number) {
            return r().doubleValue();
        }
        return Double.parseDouble(n());
    }

    public final Number r() {
        Serializable serializable = this.f41112a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ra.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.f41112a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.f41112a = str;
    }
}
