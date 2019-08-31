package cadastroHelpDesk.modelo;

import cadastroHelpDesk.modelo.Local;
import cadastroHelpDesk.modelo.Perfil;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-25T17:18:05")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> telefone;
    public static volatile SingularAttribute<Usuarios, String> Senha;
    public static volatile SingularAttribute<Usuarios, Perfil> Perfil;
    public static volatile SingularAttribute<Usuarios, Local> trabalho;
    public static volatile SingularAttribute<Usuarios, String> cpf;
    public static volatile SingularAttribute<Usuarios, String> nome;
    public static volatile SingularAttribute<Usuarios, Long> id;

}