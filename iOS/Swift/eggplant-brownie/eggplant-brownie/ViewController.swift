//
//  ViewController.swift
//  eggplant-brownie
//
//  Created by Neuler Pereira on 28/07/22.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var nome: UITextField!
    @IBOutlet weak var satisfacao: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


    @IBAction func add(_ sender: Any) {
        let saidaNome = nome.text!
        
        print ("Comi \(saidaNome) e fiquei \(satisfacao.text!)")
    }
    
}

